package objects;

public class Student3 {
	String studentName;
	int grade;
	int eng;
	int math;
	int sum;
	
	Student3(String studentName, int eng, int math, int sum) {
		this.studentName = studentName;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}
	void Sintroduce() {
		System.out.println("이름은" + this.studentName);
	}
	
}
