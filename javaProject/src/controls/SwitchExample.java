package controls;

public class SwitchExample {

	public static void main(String[] args) {

//		for(int i=0; i<5; i++) {
//		int z = (int) (Math.random() * 10);
//		
//		System.out.println(z);// 0~1 사이의 임의수
//		}
		String msg = "짝수/혹수";
		int z = (int) (Math.random() * 6) + 1;
		switch (z) {
		case 1:
//			msg = "홀수";
//			break;
		case 3:
//			msg = "홀수";
//			break;
		case 5:
			msg = "홀수";
			break;
		case 2:
//			msg = "짝수";
//			break;
		case 4:
//			msg = "짝수";
//			break;
		case 6:
			msg = "짝수";
			break;
		}
		System.out.println(z + "는 : " + msg + "입니다.");
	}

}
