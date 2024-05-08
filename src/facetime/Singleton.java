package facetime;

public class Singleton {
    // 私有静态成员变量，用于保存唯一实例的引用
    private static Singleton instance;
    // 私有构造函数，防止外部直接实例化对象
    private Singleton() {
        // 初始化单例对象的操作
    }
    // 公共静态方法，用于获取单例实例
    public static Singleton getInstance() {
        // 懒汉式单例：在首次调用时才创建实例
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }
    // 单例类的其他方法和成员变量

}
