package always.javabase;

import org.junit.Test;

/**
 * @program: Anograss
 * @description:
 * @author: Ano
 * @create: 2019-10-28 19:17
 **/
public class Basictype {
    public static void main(String[] args) {
        Basictype lnc=new Basictype();
        int i=0;
        lnc.add(i);
        i=i+2;
        System.out.println(i);
    }
    void add(int i){
        i++;
    }

    @Test
    public void test(){
        String s ="bacca";
        Integer a=Integer.parseInt(s,16);

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println();
        System.out.println(Integer.parseInt(s,16));

    }
}
