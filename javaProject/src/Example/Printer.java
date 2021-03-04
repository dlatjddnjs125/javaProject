package Example;

public class Printer {
	private int num;
	private boolean result;
	private double dob;
	private String str;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public double getDob() {
		return dob;
	}

	public void setDob(double dob) {
		this.dob = dob;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	Printer() {

	}

	static void println(int num) {
		System.out.println(num);
	}

	static void println(double dob) {
		System.out.println(dob);
	}

	static void println(String str) {
		System.out.println(str);
	}
	static void println(boolean result) {
		System.out.println(result);
		
	}
}
