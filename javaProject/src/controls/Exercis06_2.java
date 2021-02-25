package controls;

public class Exercis06_2 {
	public static void main(String[] args) {
		System.out.println(getSumValue(44,46));
		
	}
	public static int getSumValue(int i1, int i2) {
		int a;
		for (a=i1; i1<i2; i1++) {
			a = a + i1; 
		}
		return a;
	}   

}
