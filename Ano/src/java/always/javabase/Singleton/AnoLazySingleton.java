package always.javabase.Singleton;

//懒汉式单例
//单例获取实例时，需要加上同步
//在多线程的环境中，当线程1完成新建单例操作，而在完成赋值操作之前，线程2就可能判
//断instance为空，此时，线程2也将启动新建单例的操作，那么就出现了多个实例被新建
public class AnoLazySingleton {
    private AnoLazySingleton() {
        //System.out.println("懒汉式私有构造方法");
    }
    private static volatile AnoLazySingleton instance = null;

    public static synchronized AnoLazySingleton getInstance(){
        //System.out.println("懒汉式创建实例");
        return instance==null? new AnoLazySingleton():instance;
    }
}

