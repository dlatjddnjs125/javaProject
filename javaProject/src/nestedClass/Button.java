package nestedClass;

public class Button {
	
	OnClickListener Listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.Listener = listener;
	}
	
	void touch() {
		Listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
	
}
