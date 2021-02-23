package variables;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		int uniCode = c3;

		byte a1 = 5;
		int a2 = 10;
		byte a3 = (byte) (a1 + 2);
		System.out.println(a3);
		System.out.println(c1);
		System.out.println(c2);

//		++v1   v1++
		System.out.println(c3);
//		System.out.println(c4);
//		System.out.println(c5);
//		System.out.println(c6);
		System.out.println(uniCode);
	}

}
