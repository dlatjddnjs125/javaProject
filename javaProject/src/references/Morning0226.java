package references;

public class Morning0226 {

	public static void main(String[] args) {
		// morning02262();

		/*
		 * int [] engScores = new int [3]; engScores = new int[] {90, 88, 87};
		 * 
		 * int[]engscores = {};
		 * 
		 */
		int[][] scores = { { 90, 88, 87 }, { 88, 90, 92 } };
		double avg = 0.0;

		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			avg = (double) sum / scores[i].length;
			System.out.println("평균" + avg);
//		} else if (i==1) {
//			avg = (double) sum/ scores[i].length;
//			System.out.println("수학의 평균" + avg);
//		}
		}

	}

	public static void morning02262() {

//		double [] scores = new double [3];

//		int[][] scores = new int[2][3];
//		scores[0] = new int []{ 81, 90, 85,90 };
//		scores[1] = new int []{ 95, 88 };
//		System.out.println(scores.length);
//		System.out.println(scores[0].length);
//		System.out.println(scores[1].length);

		int[] engScores = { 81, 90, 85 };
		int[] mathScores = { 95, 88, 70 };

		int engsum = 0;
		int engcnt = 0;
		double engavg = 0;
		for (int i = 0; i < 3; i++) {
			engsum = engsum + engScores[i];
			engcnt = engScores.length;
			engavg = (double) engsum / engcnt;
		}
//		System.out.println("영어평균 :" + engavg);
		int mathsum = 0;
		int mathcnt = 0;
		double mathavg = 0;
		for (int i = 0; i < 3; i++) {
			mathsum = mathsum + mathScores[i];
			mathcnt = engScores.length;
			mathavg = (double) mathsum / mathcnt;
		}
		System.out.println("영어평균 :" + engavg + " / " + "수학평균 :" + Math.round(mathavg * 10) / 10.0);
	}

	public static void arraycopy() {
		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];
		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
			int[] newAry2 = new int[5];
			System.arraycopy(newAry, 0, newAry2, 1, 3);
			System.out.println(newAry2[0]);
			System.out.println(newAry2[1]);
			System.out.println(newAry2[2]);
			System.out.println(newAry2[3]);
			System.out.println(newAry2[4]);
		}
	}
}
