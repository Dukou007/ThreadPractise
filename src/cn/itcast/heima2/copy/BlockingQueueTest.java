package cn.itcast.heima2.copy;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		final BlockingQueue queue = new ArrayBlockingQueue(3);
		for(int i=0;i<2;i++){
			new Thread(){
				public void run(){
					while(true){
						try {
							Thread.sleep((long)(Math.random()*1000));
							System.out.println(Thread.currentThread().getName() + "?????????!");							
							queue.put(1);
							System.out.println(Thread.currentThread().getName() + "????????????" + 							
										"????????" + queue.size() + "??????");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
				}
				
			}.start();
		}
		
		new Thread(){
			public void run(){
				while(true){
					try {
						//?????????????????100??1000????????��??
						Thread.sleep(1000);
						System.out.println(Thread.currentThread().getName() + "????????!");
						queue.take();
						System.out.println(Thread.currentThread().getName() + "???????????" + 							
								"????????" + queue.size() + "??????");					
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}.start();			
	}
}
