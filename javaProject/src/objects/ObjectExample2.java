package objects;

public class ObjectExample2 {
	public static void main(String[] args) {
//		Person person = new Person();
//		person.Name = "홍길동";
//		person.age = 20;
//		person.wei = 70;
//		person.hig = 170;
//		person.eat();
//		person.sleep();
//		person.walk();
//		person.Pintoruduce();

//		Person person1 = new Person(30,180,75);
//		person1.Name = "김길동";
//		person.age = 20;
//		person.wei = 70;
//		person.hig = 170;
//		person1.eat();
//		person1.sleep();
//		person1.walk();
//		person1.Pintoruduce();

//		Person person2 = new Person("최길등");
//		person.Name = "홍길동";
//		person.age = 25;
//		person.wei = 75;
//		person.hig = 175;
//		person.eat();
//		person.sleep();
//		person.walk();
//		person.Pintroduce();
//		
		Person person = new Person();
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 173.2, 72.5);
		persons[1] = new Person("김길동", 25, 178.0, 77.5);
		persons[2] = new Person("최길동", 19, 177.7, 76.2);
		persons[3] = new Person("박길동", 22, 180.5, 80.5);
		persons[4] = new Person("이길동", 27, 171.5, 68.5);
		
		
			for (Person Person : persons) {
				System.out.println(person.hig);

		}

	}
}
