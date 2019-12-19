/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.javabase;

import org.junit.Test;

//操作符：&，|，&&，||

public class Operator {
    //位操作符：&，|；按bit位与
    @Test
    public void TestOperator() {
        int a = 5;        //0101
        int b = 6;        //0110
        int c = a & b;      //0100
        System.out.println("a=5,b=6,a&b=" + c);
    }

    @Test
    public void TestOperator1() {
        int i = 0, a = 0, b = 2, c = 3, d = 4;
        if (i == a++ && ++b == c) {
            System.out.println("i:" + i);
            System.out.println("a:" + a);
            System.out.println("b:" + b);
            System.out.println("c:" + c);
            System.out.println("d:" + d);
        } else {
            System.out.println("i:" + i);
            System.out.println("a:" + a);
            System.out.println("b:" + b);
            System.out.println("c:" + c);
            System.out.println("d:" + d);
        }
    }

    @Test
    public void TestShort(){
        short s1=1;
        s1= (short) (s1+1);
        System.out.println(s1);
        s1+=1;
        System.out.println(s1);
    }


}

