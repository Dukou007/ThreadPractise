package facetime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 当涉及到内存泄漏的情况时，常见的场景包括未释放对象引用、集合类使用不当以及监听器和回调函数未正确取消注册。
 */
public class MemoryLeakExample {

    // 模拟内存泄漏情况1：未释放对象引用
    private static List<Object> objectList = new ArrayList<>();

    public static void main(String[] args) {
        // 模拟内存泄漏情况2：集合类使用不当
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            String key = String.valueOf(i);
            String value = "value" + i;
            map.put(key, value);
        }

        // 模拟内存泄漏情况3：监听器和回调未取消注册
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        }, 1000);
    }
}

