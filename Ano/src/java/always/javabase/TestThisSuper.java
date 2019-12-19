package always.javabase;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-27 13:17
 **/
public class TestThisSuper {
    public static void main(String[] args) {
       /* Animal cat =new Animal("猫","橘色");
        cat.eat();*/
       Student student=new Student(190701045,"Ano");
        System.out.println("编号"+student.id+"username"+student.name);
    }
}
class Student{
    int id;
    float f=12;
    String name;
    public Student(int id,String name){
        this(name);
        this.id=id;
        System.out.println("2个参数的构造方法！");
    }
    public Student(){
        System.out.println("无参构造方法！");
    }
    public Student(String name){
        this.name=name;
        System.out.println("一个参数的构造方法！");
    }
}

class Animal{
    String name;
    String color;
    public Animal(String name,String color){
        this.name=name;
        this.color=color;
    }

    public void eat(){
        String name="老鼠";
        System.out.println(name+"再吃东西！");
    }
}















