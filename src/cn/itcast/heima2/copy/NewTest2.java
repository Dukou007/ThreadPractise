package cn.itcast.heima2.copy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description:交给四个线程，打印16个日志对象信息
 * @author:
 * @date:2019/7/3 10:27
 */
public class NewTest2 {
    public static void main(String[] args) {
        System.out.println("begin:" + (System.currentTimeMillis() / 1000));
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(16);
        //启动4个线程
        for(int i = 0; i < 4; i++){
            new Thread(new Runnable(){
                @Override
                public void run() {
                    //不断从阻塞队列中取出数据并打印
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
        for (int i = 0; i < 16; i++) { // 这行代码不能改动
            final String log = "" + (i + 1);// 这行代码不能改动,生成的日志信息
            {
                try {
                    queue.put(log);                //将日志信息放入阻塞队列
                    //Test.parseLog(log);            //打印日志信息
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
