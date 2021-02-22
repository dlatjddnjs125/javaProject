package operators;

public class MethodExample {

	public static void main(String[] args) {
//		int result = sum(10, 20);
//		int result = minus(30,20);
		int result = multi(30,20);
		System.out.println(result);
		// result NaN Infinity

	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;

	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;

	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;

	}

	public static void printAge(int age) {
		System.out.println("³ªÀÌ´Â : " + age);
	}
}
