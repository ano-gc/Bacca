package always.javabase.jvm;

/**
 * @program: Ano
 * @description:一、通过子类引用父类的静态字段，不会导致子类初始化
 *              二、通过数组定义来引用类不会触发此类的加载
 *              三、常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化
 * @author: Ano
 * @create: 2019-11-28 15:03
 **/
public class ClassLoaderPassiveReferenceDemo {
    public static void main(String[] args) {
//        一、通过子类引用父类的静态字段，不会导致子类初始化
//        System.out.println(SubClass.value);
        PassiveReference []passiveReferences=new PassiveReference[10];
        System.out.println(ConstClass.HelloWord);

    }
}
