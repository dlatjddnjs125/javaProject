package operators;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 < num2);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 == char2);
		System.out.println("result4 = " + result4);

		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

		/*
		 * char= = == != String
		 * || or
		 * && and
		 * 
		 * 
		 */

	}

}
