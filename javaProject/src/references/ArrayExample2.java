package references;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] Arys = new int[10];
		for (int i = 0; i < 10; i++) {
			Arys[i] = (int) (Math.random() * 100) + 1;
			System.out.println( Arys[i]);
		}
		int sum = 0;
		int cnt = Arys.length;
		double avg = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + Arys[i];
			avg = (double) (sum ) / cnt; 
		}
		System.out.println("배열의 합 : " + sum);
		
		sum = 0;
		System.out.println("평균 : " + avg);
		for (int i = 0; i < 10; i++) {
		}
		sum = 0;
		cnt = 0;
		for (int i = 0; i < 10; i++) {
			if (Arys[i] % 2 == 0) {
				sum = sum+Arys[i];
				cnt++;
				avg = (double) (sum + Arys[i]) / cnt;
//				System.out.println(sum +","+ cnt );
			}
		}
		System.out.println("짝수의 합 : " + sum + "짝수합평균 : " + avg);
		System.out.println(sum + "," +cnt +","+ avg);
	}

}
