package controls;

public class Excercise04 {

	public static void main(String[] args) {
		int i1 = (int) (Math.random() * 6) + 1;
		int i2 = (int) (Math.random() * 6) + 1;
		 
		 while(i1+i2 !=5) {
			  i1 = (int) (Math.random() * 6) + 1;
			  i2 = (int) (Math.random() * 6) + 1;
			  
			 
			 System.out.println(i1 + "," + i2);
			 
		 }

	}

}
