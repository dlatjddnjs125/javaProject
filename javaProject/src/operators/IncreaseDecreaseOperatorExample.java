package operators;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		x++;
		++x;
		System.out.println(x); // 12
		System.out.println(x++);
		System.out.println(++x);
		// System.out.println();
		z = ++x + y++;
		System.out.println("z : " + z + ", x: " + x + ",y:" + y);
		// TODO Auto-generated method stub class rename F2

	}

}
