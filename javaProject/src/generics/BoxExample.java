package generics;

public class BoxExample {
	public static void main(String[] args) {


		Apple one = new Apple(1000,"홍옥");
		Apple two = new Apple(1000,"부사");
		System.out.println(one);
		System.out.println(two);
		
		if(one.equals(two)) {
			System.out.println("동일객체");
			
		}else {
			System.out.println("다른객체");
		}
		
//		Box<Apple> box = new Box<Apple>();
//		box.setBox(apple);
//		
		
//		Box<Orange> orangeBox = new Box<Orange> ();
//		orangeBox.setBox(orange);;
//
//		Box box = new Box();
//		box.setBox(orange);
//		String newStr =(String) box.getBox();
//		Apple newApple = (Apple) box.getBox();
//		Orange newOrange = (Orange) box.getBox()

	}
}
