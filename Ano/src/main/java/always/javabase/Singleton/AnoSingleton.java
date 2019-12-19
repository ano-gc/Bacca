package always.javabase.Singleton;

//饥汉式单例
//这种单例最常见，也很可靠！
//它有个唯一的缺点就是无法完成延迟加载——即当系统还没有用到此单例时，单例就会被加载到内存中。
public class AnoSingleton {
    private AnoSingleton() {
        //System.out.println("饥汉式私有构造方法！");
    }

    private static AnoSingleton instance = new AnoSingleton();

    public static AnoSingleton getInstance() {
        //System.out.println("饥汉式创建实例");
        return instance;
    }
    public static void main(String[] args) {
        AnoSingleton.getInstance();
    }
}

