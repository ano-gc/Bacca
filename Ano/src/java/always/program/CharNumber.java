package always.program;

import java.util.Scanner;

/**
 * @program: Ano
 * @description: 接收一个字符串和其中的一个字符；统计字符串中该字符出现的次数
 * @author: Ano
 * @create: 2019-11-12 11:09
 **/
public class CharNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串，按回车输入其中的某个字符：");
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        String str = in.next();
        String cha = in.next();
        char[] strc = str.toUpperCase().toCharArray();
        char[] chac = str.toUpperCase().toCharArray();
        int j=0;
        for (int i = 0; i < strc.length; i++) {
            if(strc[i]==chac[0]){
                j++;
            }
        }
        System.out.println("字符"+cha+"在"+str+"出现了"+j+"次！");
    }
}















/*
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        in.useDelimiter("\n");
        String str=in.nextLine().toUpperCase();
        String cha=in.nextLine().toUpperCase();
        char[]  strc=str.toCharArray();
        char[]  chac=cha.toCharArray();
        int j=0;
        for (int i = 0; i < strc.length; i++) {
            if(strc[i]==chac[0]){
                j++;
            }
        }
        System.out.println("字符串："+str+"中字符："+cha+"出现的次数是："+j);
    }*/
