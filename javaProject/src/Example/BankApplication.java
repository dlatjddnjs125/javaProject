package Example;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.게좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else if (selectNo == 6) {
				String ano = scanner.next();
				findAccount(ano);
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				System.out.println("--------------");
				System.out.println("계좌생성");
				System.out.println("--------------");
				System.out.print("계좌번호 : ");
				String ano = scanner.next();
				System.out.print("계좌주 : ");
				String owner = scanner.next();

				System.out.print("초기입금액 : ");
				int balance = scanner.nextInt();
				if (balance > 1000000 || balance < 0) {
					System.out.println("초기 입금액 오류");
					balance = 0;
					break;
				}
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println(accountArray[i]);
				System.out.println(accountArray[i].MAX);
				System.out.println(accountArray[i].getBalance());
				System.out.println("결과 : 계좌가 생성되었습니다");
				break;
			}
		}

	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(i + "," + accountArray[i]);
			}
		}

	}

	private static void deposit() {
		System.out.println("입금계좌선택");
		System.out.println("계좌번호 입력> ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		System.out.print("입금액 입력 >");
		int dep = scanner.nextInt();
		if (account.getBalance() + dep > 1000000) {
			System.out.println("입금 불가");
		} else {
			account.setBalance(account.getBalance() + dep);
			System.out.println("입금금액 : " + dep + ",  현재 잔액" + account.getBalance());
		}

	}

	private static void withdraw() {
		System.out.println("출금계좌선택");
		System.out.println("계좌번호 입력> ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		System.out.print("출금액 입력 >");
		int dep = scanner.nextInt();
		if (account.getBalance() - dep < 0) {
			System.out.println("출금 불가");
		} else {
			account.setBalance(account.getBalance() - dep);
			System.out.println("출금금액 : " + dep + ",  현재 잔액" + account.getBalance());
		}
	}


	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if ((accountArray[i].getAno()).equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
		return account;
	}
}
