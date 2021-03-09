package exceptions;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		int[] winningNumber = new int[6];
		for (int i = 0; i < 6; i++) {
			Random random = new Random(5);
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.println("당첨번호 :");
			System.out.print(winningNumber[i] + ",");
		}
		while (true) {
			System.out.println("선택번호 = ");
			for (int i = 0; i < 6; i++) {
				Random random = new Random(3);
				selectNumber[i] = random.nextInt(45) + 1;
				System.out.print(selectNumber[i] + " ");
			}
			Arrays.sort(selectNumber);
			Arrays.sort(winningNumber);
			boolean result = Arrays.equals(selectNumber, winningNumber);
			System.out.println("당첨여부 : ");
			if (result) {
				System.out.println("1등에 당첨되셨습니다");
				break;
			} else {
				System.out.println("당첨되지 않았습니다");
			}

		}
	}

}
