package nestedClass;

class MesageListener implements Button.OnClickListener {
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();

		btn.setOnClickListener(new MesageListener());
		btn.touch();

		btn.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("영상을 보냅니다.");
			}
		});
		
	}

}
