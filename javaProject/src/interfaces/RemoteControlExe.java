package interfaces;

public class RemoteControlExe {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnON();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnON();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new RemoteControl() {
			int volume;
			@Override
			public void turnON() {
				System.out.println("DVD를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("DvD를 끕니다");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("현재 dvd볼륨은 : " + volume);
			}
			
		};
		rc.turnON();
		rc.turnOff();
		rc.setVolume(8);
	}

}
