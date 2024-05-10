package MultpleThread;

public class Singleton01 {
    private static volatile Singleton01 instance;

    private Singleton01() {
        if (instance != null) {
            throw new IllegalStateException("实例已存在");
        }
    }

    public static Singleton01 getSingleton() {
        if (instance == null) {
            synchronized (Singleton01.class) {
                instance = new Singleton01();
            }
        }
        return instance;
    }
}
