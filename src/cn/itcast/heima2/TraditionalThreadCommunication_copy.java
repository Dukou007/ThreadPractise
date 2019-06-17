package cn.itcast.heima2;

public class TraditionalThreadCommunication_copy {

	public static void main(String[] args) {

		final DoThread doThread = new DoThread();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 50; i++) {
					doThread.sub(i);
				}

			}
		}).start();

		for (int i = 1; i <= 50; i++) {
			doThread.main(i);
		}

	}

}

class DoThread {

	private boolean bShouldSub = true;

	public synchronized void sub(int i) {
		while (!bShouldSub) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int j = 1; j <= 10; j++) {
				System.out.println("sub thread sequence of " + j + ",loop of " + i);
			}
			bShouldSub = false;
			this.notify();
		}
	}

	public synchronized void main(int i) {
		while (bShouldSub) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int j = 1; j <= 50; j++) {
				System.out.println("main thread sequence of " + j + ",loop of " + i);
			}
			bShouldSub = true;
			this.notify();
		}
	}

}