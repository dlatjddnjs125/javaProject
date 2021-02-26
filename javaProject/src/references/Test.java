package references;

public class Test {

	public static void main(String[] args) {
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " 점수 => " + scores[i]);
		}
		for (String name : names) {
			System.out.println(name);
		}
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 합 : " + sum);
		System.out.println("점수 평균 : " + sum/scores.length);
	}

}
