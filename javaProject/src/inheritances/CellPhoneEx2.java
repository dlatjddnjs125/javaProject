package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = /*(CellPhone)*/ new DmbPhone();
//		cp = new SmartPhone();
//		cp.channel = 15;
		cp.color = "";
		
		if(cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp;
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
			
		}else {
			System.out.println("Casting할수없습니다");
		}
		
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
				
		
	}

}
