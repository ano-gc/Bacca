package always.javabase.jvm;

/**
 * @program: Ano
 * @description:通过子类引用父类的静态字段，不会导致子类初始化
 * @author: Ano
 * @create: 2019-11-28 14:59
 **/
public class PassiveReference {
    static{
        System.out.println("PassiveReference init!");
    }

    public static int value =123;
}
