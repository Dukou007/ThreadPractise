package cn.itcast.heima2.copy;

import sun.rmi.runtime.Log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description:บวบว
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/7/3 11:01
 */
public class NewTest3 {
    public static void main(String[] args) {
        final BlockingQueue<String>queue=new ArrayBlockingQueue<String>(16);
        for (int i = 0; i <4 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        try {
                            String log = queue.take();
                            NewTest3.parseLog(log);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }


        for (int i = 0; i <16 ; i++) {
            final String log=""+i;
            try {
                queue.put(log);
            } catch (InterruptedException e) {
                e.printStackTrace();
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
