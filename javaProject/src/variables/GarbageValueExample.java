package variables;

public class GarbageValueExample {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		byte var1 =120;
		int var2 = 125;
		for(int i=0; i<10; i++) {
			var1++;
			var2++;
			System.out.println("Var1: " + var1 + "\\" + "var2: " + var2);
			// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\escape
		}

	}

}
