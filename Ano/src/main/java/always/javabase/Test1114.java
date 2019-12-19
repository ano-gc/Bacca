package always.javabase;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-14 19:16
 **/
public class Test1114 {
    public static void main(String[] args) {
        int  a=100,b=50,c=a---b,d=a---b;
        System.out.println(a--);
        System.out.println(a+";"+b+";"+c+";"+d+";");
        int  a1=100,b1=50,c1=(a1--)-b1,d1=(a1--)-b1;
        System.out.println(a1+";"+b1+";"+c1+";"+d1+";");
        int  a2=100,b2=50,c2=a2-(--b2),d2=a2-(--b2);
        System.out.println(a2+";"+b2+";"+c2+";"+d2+";");
        int  a3=100,b3=50,c3=--a3-b3,d3=--a3-b3;
        System.out.println(a3+";"+b3+";"+c3+";"+d3+";");

        int j=100;
        int m=j--;
        System.out.println(m);
        System.out.println(j);
        int k=100;
        int n=--k;
        System.out.println(n);
        System.out.println(k);

    }
    @Test
    public void main(){
        double d1=-0.5;
        System.out.println("Ceil d1="+Math.ceil(d1));
        System.out.println("Ceil d1="+Math.floor(d1));
        System.out.println("Ceil d1="+Math.round(d1));
        System.out.println(100%3);
        System.out.println(100%3.0);
    }
    @Test
    public void test1209(){
        Iterator iterator=new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
    @Test
    public void test12091(){

    }
}
