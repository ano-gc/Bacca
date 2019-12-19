package always.javabase.Singleton;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestSingletonDemo {

    //创建单例
    @Test
    public void TestCreateSingleton() {
        System.out.println("饥汉式单例");
        AnoSingleton.getInstance();

        System.out.println("懒汉式单例");
        AnoLazySingleton.getInstance();
    }

    //测试饥汉式单例与懒汉式单例的创建时间；
    @Test
    public void TestSingletonTime() {
        long begintimesingleton = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            AnoSingleton.getInstance();
        }
        System.out.println("饥汉式创建单例时间/ms：" + (System.currentTimeMillis() - begintimesingleton));
        for (int i = 0; i < 10000; i++) {
            AnoLazySingleton.getInstance();
        }
        System.out.println("懒汉式创建单例时间/ms:" + (System.currentTimeMillis() - begintimesingleton));
    }

    //反序列化导致多个单例
    @Test
    public void TestSerialization() {
        AnoInternalClassSingleton instance1 = null;
        AnoInternalClassSingleton instance2 = AnoInternalClassSingleton.getInstance();

        //将实例串行化到文件
        try {
            FileOutputStream fos = new FileOutputStream("Serialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //从文件读取到单例
        try {
            FileInputStream fis = new FileInputStream("Serialization.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //OIS调用readObject()之后会去调用AnoInternalClassSingleton中的readResolve
            instance1 = (AnoInternalClassSingleton) ois.readObject();
            System.out.println("断点");
            if (instance1 == instance2) {
                System.out.println("同一个实例！");
            } else {
                System.out.println("不是同一个实例");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestOverrideSetAccessible() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Ano ano=new Ano();
        ano.setCreateuser("ano");

        //获得Ano的私有方法
        Method method=Ano.class.getDeclaredMethod("getCreateuser");

        //计算开销时间
        long beginTime=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            method.invoke(ano,new Object[]{});
        }
        System.out.println("Invoker时间：");
        System.out.println(System.currentTimeMillis()-beginTime);

        method.setAccessible(true);
        long beginTime2=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            method.invoke(ano,new Object[]{});
        }
        System.out.println("setAccessible时间：");
        System.out.println(System.currentTimeMillis()-beginTime2);
    }
}
