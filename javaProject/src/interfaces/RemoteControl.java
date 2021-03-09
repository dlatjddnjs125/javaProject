package interfaces;

public interface RemoteControl {
	/*static final*/ int MAX_VOLUM = 10;
	int MIN_VOLUME = 0;
	void turnON(); //추상메소드만선언가능 구현Xㅇ
	void turnOff();
	void setVolume(int volume);
}
