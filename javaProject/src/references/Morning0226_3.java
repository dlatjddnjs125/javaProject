package references;

public class Morning0226_3 {
	public static void main(String[] args) {

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
