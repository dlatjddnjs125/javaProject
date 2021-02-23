package operators;

public class Excercise06 {

	public static void main(String[] args) {

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;

		double area = (lengthTop + lengthBottom) / 2.0 * height;
		System.out.println("area1 = " + area);
	}

	public static double getRectArea(int Top, int Bottom, int height) {

		double area = (double) (Top + Bottom) / 2 * height;
		return area;
		
		


	}

}
