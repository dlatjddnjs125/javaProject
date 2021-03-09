package exceptions;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "100.5";
		
		int value1 = Integer.parseInt(data1);
		double value2 = Double.parseDouble(data2);
		
		double result = (double)value1+value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
		
	}

}
