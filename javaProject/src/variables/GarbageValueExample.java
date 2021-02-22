package variables;

public class GarbageValueExample {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		int var1 = 16;
		int var2 = 50;
		int var3 = 41;

		for (int i = 0; i < 10; i++) {
			var1++;
			var2++;
			var3++;
			double dub1 = (double) (var1 + var2 + var3) / 3;
			System.out.println("Var1: " + var1 + "\t" + "var2: " + var2 + "\t" + "var3: " + var3 + "\t" + "ave" + dub1);
			// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\escape
		}

	}

}
