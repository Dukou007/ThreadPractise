package ThreadTest;

public class Singleton {
    // init instance
    private static volatile Singleton instance;

    // private contructor
    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("instance has existed");
        }
    }
    // 公共静态方法，提供获取实例的方式
    private static Singleton getInstance(Singleton instance) {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
