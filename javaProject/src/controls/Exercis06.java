package controls;

public class Exercis06 {
	public static void main(String[] args) {
		int sNum = 67;
		int eNum = 44;

		System.out.println(getSumValue(sNum, eNum));
	}

	public static int getSumValue(int i, int j) {
		int sum = 0;
		for (int a = i; a <= j; a++) {
			sum = sum + a;
		}
		return sum;
// ///////////////int startNo = (n1 >n2) ? n2 : n1;
	} 
}

//	public static void exercise06 {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//
//			}System.out.println();
//
//		}
//	}
//
//}
