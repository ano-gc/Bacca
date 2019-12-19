package always.javabase.jvm;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-28 17:10
 **/
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }
    static final String HelloWord="Hello World!";
}
