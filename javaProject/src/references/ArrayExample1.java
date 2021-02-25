package references;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] Arys = new int[5];
		for (int i = 0; i < 5; i++) {
			Arys[i] = (int) (Math.random() * 10) + 1;
			System.out.println(Arys[i]);
		}
//		int[] Arys = { 1, 5, 1, 4, 3 };
		int maxValue = 0;
		for (int i = 0; i < Arys.length; i++) {
			if (Arys[i] > maxValue) {
				maxValue = Arys[i];
			}
		}
		System.out.println("최댓값 : " + maxValue);

	}

}
