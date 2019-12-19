package always.javabase.Singleton;

import java.io.Serializable;

//内部内
//通过静态内部类来托管单例，当这个单例被加载时，不会初始化单例类，只有当getInstance方法被调用的时候，才会去加载
//InternalClass，从而才会去初始化instance。并且，单例的加载是在内部类的加载的时候完成的，所以天生对线程友好
//不需要synchronized关键字，可以说是兼具了以上的两个优点。
public class AnoInternalClassSingleton implements Serializable {

    private AnoInternalClassSingleton(){
    }
    private static class InternalClass{
        private static AnoInternalClassSingleton Instance=new AnoInternalClassSingleton();
    }

    public static AnoInternalClassSingleton getInstance(){
        return InternalClass.Instance;
    }

    private Object readResolve(){
        System.out.println("执行readResolve方法!");
        // instead of the object we're on,
        // return the class variable INSTANCE
        return InternalClass.Instance;
    }

    public static void main(String[] args) {
      AnoLazySingleton instance= AnoLazySingleton.getInstance();
    }
}
