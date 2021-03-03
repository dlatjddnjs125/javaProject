package Example;

public class objectExample {
	public static void main(String[] args) {
//		Student s1 = new Student("홍길동",90,85);
		Student s2 = new Student("김길동",80,75);
		Student s3 = new Student("이길동",70,95);
		Student s4 = new Student();
//		s4.name = "최길동";
		s4.setName("최길동");
		s4.setEng(-70);
//		s4.eng = 70;
//		s4.math = 80;
		s4.setMath(80);
		System.out.println(s4.getMath());
				
				
		new Student();
		
		
		Student[] students = new Student[4];
		students[0] = new Student("홍길동",90,85);
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		for (Student student : students) {
			student.showInfo();
		}
//		void showInfo () {
//			System.out.println("이름 : " + name + ", 영어 : " + eng + ", 수학" + math  + ",합계 : " + (eng+namth));
//		}
		
		
	}
}
