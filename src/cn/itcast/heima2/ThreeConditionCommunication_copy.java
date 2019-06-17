package cn.itcast.heima2;

public class ThreeConditionCommunication_copy {

	public static void main(String[] args) {
		final Business business = new Business();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 50; i++) {
					business.sub(10);
				}
			}
		}).start();

		for (int i = 1; i <= 50; i++) {
			synchronized (ThreeConditionCommunication_copy.class) {
				for (int j = 1; j <= 10; j++) {
					System.out.println("main Thread sequece of " + j + ",loop of " + i);
				}
			}
		}

	}

	static class Business {
		private Boolean bShouldSub = true;

		public synchronized void sub(int i) {

			if (bShouldSub) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			for (int j = 1; j <= 10; j++) {
				System.out.println("sub thread suequece of " + j + "loop of " + i);
			}
			bShouldSub=false;
			this.notify();
		}

		public synchronized void main(int i) {
			
			if (!bShouldSub) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int j = 1; j <= 100; j++) {
				System.out.println("main thread suequece of " + j + "loop of " + i);
			} 
			
			bShouldSub=false;
			this.notify();
		}

	}

}
