package controls;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.학생수 | 2.점수 입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			if (selectNo != 1 && selectNo != 5 && scores == null) {
				System.out.print("학생수를 입력하세요");
				System.out.println();
				continue;
			}
			if(selectNo ==1) {
				System.out.print("학생 수 > ");
				studentNum = scanner.nextInt();
				scores =new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores" + i + " > " );
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + scores[i] );
//					System.out.println(scores[i] );
				}
			} else if (selectNo == 4) {
				int maxValue=0;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > maxValue) {
						maxValue = scores[i];
					}
				}
				System.out.println("최고점수 : " + maxValue);
				int sum = 0;
				double avg = 0;
				int cnt = scores.length;
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				avg = (double) (sum ) / cnt; 
//				System.out.println("배열의 합 : " + sum);
				
				sum = 0;
				System.out.println("점수평균 : " + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
				
		
				

	}

}
