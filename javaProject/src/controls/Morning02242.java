package controls;

public class Morning02242 {
	public static void main(String[] args) {
		
		int math = (int) (Math.random() * 100) + 1;
		int english = (int) (Math.random() * 100) + 1;
		
		
		getAverage(math, english);
		
		
		
	}
	public static String getAverage(int math, int english) {
		double ave = (double) (math+english)/2;
		String grade = "";
		if (ave >=90) {
			grade = "수";
		} else if (ave >=80) {
			grade = "우";
		} else if (ave >=70) {
			grade = "미";
		} else {
			grade = "가";	
		}
		 
		System.out.println(" 수학 : " + math +" 영어 : " + english + " 평균 : " + ave  + " 성적 : " +grade);
		return grade;
	
	
	}
	
	
	

}
