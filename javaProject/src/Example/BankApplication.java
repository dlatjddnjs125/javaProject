package Example;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.게좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");
			int selectNo =scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println(accountArray[0]);
				 createAccount();
			}else if (selectNo ==2) {
//				accountList();
			}else if (selectNo ==3) {
//				deposit();
			}else if (selectNo ==4) {
//				withdraw();
			}else if (selectNo == 5) {
				run =false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		Account account = new Account();
		for(int i = 0; i <accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account();
				System.out.println("--------------");
				System.out.println("계좌생성");
				System.out.println("--------------");
				System.out.print("계좌번호 : ");
				account.setAno(scanner.next());
				System.out.print("계좌주 : ");
				account.setOwner(scanner.next());
				System.out.print("초기입금액 : ");
				account.setBalance(scanner.nextInt());	
				System.out.println("결과 : 계좌가 생성되었습니다");
				break;
			}
		}
			
		
	}

}