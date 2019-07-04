package cn.itcast.heima2.copy;

import sun.rmi.runtime.Log;

/**
 * @description:���еĳ������ģ�������16����־����
 * ������Ҫ����16����ܴ�ӡ����Щ��־�����ڳ���������4���߳�ȥ����parseLog()��������ͷ��ӡ��16����־����
 * ����ֻ��Ҫ����4�뼴�ɴ�ӡ����Щ��־����
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
