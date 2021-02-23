package controls;

public class WhileExample2 {
	public static void main(String[] args) {
		
		int num = 2;
		while(num<=9) {
			int i = 1;
			while(i<=9) {
				int result = num*i;
				System.out.println(num+"*"+ i +"="+result);
				i++;
				}
			num++;
		}	
	}

}
