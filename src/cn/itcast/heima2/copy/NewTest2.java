package cn.itcast.heima2.copy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description:�����ĸ��̣߳���ӡ16����־������Ϣ
 * @author:
 * @date:2019/7/3 10:27
 */
public class NewTest2 {
    public static void main(String[] args) {
        System.out.println("begin:" + (System.currentTimeMillis() / 1000));
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(16);
        //����4���߳�
        for(int i = 0; i < 4; i++){
            new Thread(new Runnable(){
                @Override
                public void run() {
                    //���ϴ�����������ȡ�����ݲ���ӡ
                    while(true){
                        String log;
                        try {
                            log = queue.take();
                            parseLog(log);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

            }).start();
        }
        for (int i = 0; i < 16; i++) { // ���д��벻�ܸĶ�
            final String log = "" + (i + 1);// ���д��벻�ܸĶ�,���ɵ���־��Ϣ
            {
                try {
                    queue.put(log);                //����־��Ϣ������������
                    //Test.parseLog(log);            //��ӡ��־��Ϣ
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void parseLog(String log) {
        System.out.println(log + ":" + (System.currentTimeMillis() / 10));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
