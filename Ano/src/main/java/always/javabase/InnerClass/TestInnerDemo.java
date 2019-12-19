/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.InnerClass;


import org.junit.Test;

public class TestInnerDemo {

    @Test
    public void TestInner(){

        //创建外部类对象
        Outter outter=new Outter();
        //为外部类成员赋值
        outter.setOuttername("Value==ANO");
        //创建内部类
        Outter.Inner in=outter.getInner();
        //为内部类成员赋值；通过内部类获得外部类成员属性的Value
        in.setInnername("innername");
        //打印外部成员属性
        System.out.println(in.getInnername());
    }
}
