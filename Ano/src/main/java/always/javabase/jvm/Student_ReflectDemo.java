package always.javabase.jvm;

import lombok.Data;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-15 09:29
 **/

@Data
public class Student_ReflectDemo {
    private String name;
    private int age;
    public String id;

    //无参构造方法
    public Student_ReflectDemo() {
        System.out.println("调用了——公有——无参——构造方法！");
    }
    //有一个参数的构造方法
    public Student_ReflectDemo(String name){
        this.name=name;
        System.out.println("调用了——公有——有参——构造方法！"+"姓名："+name);
    }
    //有多个参数的构造方法
    public Student_ReflectDemo(String name,int age){
        System.out.println("调用了——公有——多参——构造方法！"+"姓名："+name+"年龄"+age);
    }
    //收保护的构造方法
    protected Student_ReflectDemo(boolean n){
        System.out.println("受保护的构造方法! n="+n);
    }
    //私有构造方法
    private Student_ReflectDemo(int age){
        this.age=age;
        System.out.println("私有的构造方法！年龄："+age);
    }

    public void Methods(){
        System.out.println("公共方法!");
    }
    private void PriMethods(){
        System.out.println("私有方法!");
    }
}
