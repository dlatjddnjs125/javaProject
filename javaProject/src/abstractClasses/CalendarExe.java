package abstractClasses;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println("-------------------");
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.get(Calendar.DATE));

//		
//		
//		System.out.printf("%2d" , 9);
//		System.out.printf("%3d" , 10);
//		System.out.printf("%5s" , "sun");

//		for(int m = 0; m<12; m++) {
//			System.out.println("          " + (m+1) + " 월");
		Scanner scn = new Scanner(System.in);
		int yy, mm;
		boolean run = true;
		while (run) {

			System.out.println("------");
			System.out.println("1.달력 2종료");
			System.out.println("------");
			int selNo = scn.nextInt();
			if (selNo == 1) {

				System.out.print("연도 선택 >>");
				yy = scn.nextInt();
				System.out.print("월 선택 >>");
				mm = (scn.nextInt()-1);
				cal.set(yy, mm, 1);

				int max = cal.getActualMaximum(Calendar.DATE);
				int firstDay = cal.get(Calendar.DAY_OF_WEEK);
				System.out.println("         "+(mm+1) + "월");
				for (int i = 1; i < firstDay; i++) {
					System.out.printf("%3s", " ");
				}
				for (int i = 0; i < max; i++) {
					System.out.printf("%3d", i+1);
					if ((firstDay + i) % 7 == 0) {
						System.out.println();
					}

//			}System.out.println();
				}
				System.out.println("");
			}else if (selNo ==2) {
				run = false;
			}
		}

	}

}
