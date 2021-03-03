package objects;

public class Person {
	String Name;
	int age;
	double hig;
	double wei;
	Person(String name, int age, double hig, double wei) {
		this.Name = name;
		this.age = age;
		this.hig = hig;
		this.wei = wei;
		System.out.println("이름은 : " + this.Name + ", 나이는 : " + this.age + "입니다.");
	}

	Person() {
	}

	Person(String Name) {
		this.Name = Name;
	}

	Person(int age, int wei, int hig) {
		this.age = age;
		this.wei = wei;
		this.hig = hig;
	}

	void eat() {
		System.out.println("먹는다");
	}

	void sleep() {
		System.out.println("잔다");
	}

	void walk() {
		System.out.println("걷는다");
	}

	void Pintroduce() {
		System.out.println("이름은 : " + this.Name + ", 나이는 : " + this.age + "입니다.");

	}	
}
