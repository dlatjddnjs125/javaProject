package controls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade;
		
		int score = 98;
		
		switch (score) {
		case 99:
			grade = "A+";
			break;
		case 98:
			grade = "B+";
			break;
		case 97:
			grade = "C+";
			break;
		default : grade = "F";

		}
		System.out.println(grade);
		// if ,else 90 -> a

	}
}
