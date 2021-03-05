package inheritances;

public class CellPhoneEx {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "White";
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		
		cp.equals("");
		cp.getClass();
		cp.toString();
		cp.commonMethod();
		System.out.println("=====================================");
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel = 10;
		dp.powerOn();
		dp.bell();
		dp.turnOnDmb();
		dp.changeChannel(20);
		dp.turnOffDmb();
		dp.powerOff();
		dp.commonMethod();
		System.out.println("=====================================");
		SmartPhone sp = new SmartPhone();
		sp.model = "LGPhone";
		sp.color = "Pink";
		sp.commonMethod();
		System.out.println("=====================================");
		System.out.println(cp.toString());
		System.out.println(dp);
		System.out.println(sp);
	}

}
