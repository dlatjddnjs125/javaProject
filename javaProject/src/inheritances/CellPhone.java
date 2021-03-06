package inheritances;

public class CellPhone {
	String model;
	String color;

	void powerOn() {
		System.out.println("CellPhone 전원을 켭니다");
	}

	void bell() {
		System.out.println("Cellphone 벨이 울립니다");
	}

	void hangUp() {
		System.out.println("CellPhone 전화를 끊습니다");
	}

	void powerOff() {
		System.out.println("CellPhone 전원을 끕니다");
	}
	void commonMethod() {
		System.out.println("모델 : " + model + ", 색상 : " + color);
	}

	@Override
	public String toString() {
		return "Cellphone => model : " + model + "color : " + color;
	}
	
	
}
