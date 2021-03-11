package threads;

import java.awt.Toolkit;

class WorkerThread extends Thread {
	Toolkit tkit = Toolkit.getDefaultToolkit();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			tkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class NewThread implements Runnable {
	@Override
	public void run() {
		Toolkit tkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// Thread 상속받아서 새로운 WorkerThread 클래스 생성.
//		Thread thread = new WorkerThread();
//		thread.start();

		// Runnable I/F 구현하는 클래스를 Thread(new Runnable())의 생성자 매개값.
		Thread thread = new Thread(new NewThread());
		thread.start();

		thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit tkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					tkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		Toolkit tkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
