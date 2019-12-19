package always.javabase.jvm;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @program: Ano
 * @description: 通过反射获取类的信息并使用
 * @author: Ano
 * @create: 2019-11-15 09:28
 **/
public class JavaReflect {

    //获得Class的三种方法
    @Test
    public void TestGetClass() {
        //通过实例对象的getClass方法获得
        Student_ReflectDemo studentReflectDemo = new Student_ReflectDemo();
        Class studentClass1 = studentReflectDemo.getClass();

        //通过类的静态Class属性获得
        Class studentClass2 = Student_ReflectDemo.class;

        System.out.println(studentClass1 == studentClass2);
        System.out.println(studentClass1.equals(studentClass2));

        //通过Class.forname获得
        try {
            //Class.forname参数是真实路径，就是带包名的类路径
            Class studentClass3 = Class.forName("always.javabase.jvm.Student_ReflectDemo");
            System.out.println(studentClass3 == studentClass1);
            System.out.println(studentClass3.equals(studentClass1));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestGetConstructor() throws Exception {
        Class clazz = Student_ReflectDemo.class;

        //
        System.out.println("所有公有构造方法！");
        Constructor[] constructor = clazz.getConstructors();
        for (Constructor c : constructor) {
            System.out.println(c);
        }

        //
        System.out.println("所有构造方法！");
        constructor = clazz.getDeclaredConstructors();
        for (Constructor c :
                constructor) {
            System.out.println(c);
        }

        Constructor con = clazz.getConstructor(null);
        System.out.println(con);

        //获取公有一参构造函数
        Constructor con1 = clazz.getDeclaredConstructor(java.lang.String.class);
        Student_ReflectDemo studentReflectDemo = (Student_ReflectDemo) con1.newInstance("葛超");
        System.out.println(studentReflectDemo.getName());

        //获取私有构造方法并调用暴力访问
        con=clazz.getDeclaredConstructor(int.class);
        con.setAccessible(true);
        studentReflectDemo= (Student_ReflectDemo) con.newInstance(25);
        System.out.println(studentReflectDemo.getAge());
    }

    @Test
    public void TestFields() throws Exception {
        Class clazz =Class.forName("always.javabase.jvm.Student_ReflectDemo");

        //
        System.out.println("*********获取所有共有字段**********");
        Field[] f=clazz.getFields();
        for (Field c :
                f) {
            System.out.println(c);
        }

        //
        System.out.println("**********获取所有字段***********");
        f=clazz.getDeclaredFields();
        for (Field c :
                f) {
            System.out.println(c);
        }
    }

    @Test
    public void TestReflectCrossByGeneric() throws Exception {
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("aaa");
        stringArrayList.add("bbb");

        //stringArrayList.add(100);

        //获取ArrayList的Class对象，反向的调用add()方法，添加数据
        Class listClass=stringArrayList.getClass();
        Method method=listClass.getMethod("add", Object.class);
        method.invoke(stringArrayList,100);

        for (Object s:stringArrayList
             ) {
            System.out.println(s);
        }
    }
}
