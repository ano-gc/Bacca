package always.program;

import java.util.Scanner;

/**
 * @program: Ano
 * @description:计算字符串中最后一个单词的长度，单词以空格隔开
 * @author: Ano
 * @create: 2019-11-12 10:57
 **/
public class WordLength {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        String[] array=str.split(" ");
        String word =array[array.length-1];
        System.out.println("最后一个单词的长度是："+word.length());
    }
}
