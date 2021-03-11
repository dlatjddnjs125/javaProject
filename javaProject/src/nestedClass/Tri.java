package nestedClass;

public class Tri {

	public static void main(String[] args) {
		int[][] sc = new int[5][5];
		int sum = 0;
		for(int i =0; i<sc.length; i++) {
			sum = i+1;
			for(int j =0; j<sc[i].length; j++) {
				sc[i][j] = sum+(j*sc[i].length); 
				System.out.printf("%3d",sc[i][j]);
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		int a;
		for(int i = 0; i < sc.length; i++) {
			a = i+1;
			sum = a*5;
			a++;
			for(int j=0; j<sc[i].length; j++) {
				sc[i][j] = sum--;		
			System.out.printf("%3d",sc[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		sum=0;
		a = 1;			
		for(int i = 0; i <sc.length; i++) {
			
			sum=(sc.length*sc[i].length)-(i*5);
			for(int j = 0; j<sc[i].length; j++) {
				sc[i][j] =  sum-j;
				System.out.printf("%3d", sc[i][j]);
			}
			
			System.out.println();
		}
		
		
		
	}

}
