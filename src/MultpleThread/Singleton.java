package MultpleThread;


public class Singleton {
    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static Singleton instance(Singleton instance) {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

}
