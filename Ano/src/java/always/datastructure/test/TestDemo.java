package always.datastructure.test;

import always.datastructure.test.TestClassAnnotation;

/**
 * @program: springboot
 * @description:
 * @author: Ano
 * @create: 2019-10-12 09:24
 **/
public class TestDemo {
    public static void main(String[] args) {
        TestClassAnnotation t=new TestClassAnnotation();
        t.setStr("3216464");
        System.out.println(t.getStr());
    }
}
