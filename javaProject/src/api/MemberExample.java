package api;

public class MemberExample {
	public static void main(String[] args) {
//		Member obj1 = new Member("blue");
//		Member obj2 = new Member("blue");
//		Member obj3 = new Member("red");
//		if(obj1.equals(obj2)) {
//			System.out.println("obj1과 obj2는 동등합니다.");
//			
//		}else {
//			System.out.println("obj1과 obj2는 동등하지 않습니다");
//		}
//		
//		if(obj1.equals(obj3)) {
//			System.out.println("obj1과 obj3은 동등합니다.");
//			
//		}else {
//			System.out.println("obj1과 obj3은 동등하지 않습니다.");
//		}
		Member original = new Member("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그렌져";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("Scores : {" );
		for(int i =0; i<cloned.scores.length; i++) {
		System.out.print(cloned.scores[i]);
		System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);
		System.out.println();
		cloned.name = "최길동";
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("Scores : {" );
		for(int i =0; i<original.scores.length; i++) {
		System.out.print(original.scores[i]);
		System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);
		
		System.out.println(original.name);
	
			
	
	}
	
}
