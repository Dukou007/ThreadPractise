package cn.itcast.heima2.copy;

import sun.rmi.runtime.Log;

/**
 * @description:现有的程序代码模拟产生了16个日志对象，
 * 并且需要运行16秒才能打印完这些日志，请在程序中增加4个线程去调用parseLog()方法来分头打印这16个日志对象，
 * 程序只需要运行4秒即可打印完这些日志对象
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/7/3 10:17
 */
public class NewTest {
    public static void main(String[] args) {
        System.out.println("begin:"+(System.currentTimeMillis()/10));
        for (int i = 0; i < 16; i++) {
            final String log=""+i;{
                NewTest.parseLog(log);
            }
        }
    }

    public static void parseLog(String log) {
        System.out.println(log +":"+(System.currentTimeMillis()/10));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
