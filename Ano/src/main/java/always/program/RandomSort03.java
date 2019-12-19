package always.program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @program: Ano
 * @description:随机生成指定个数的数组，要求N≤1000；对于其中重复的数字只保留一次，将产生的数组从大到小排序。
 * @author: Ano
 * @create: 2019-11-13 16:02
 **/
public class RandomSort03 {

    public static void main(String[] args) {
        System.out.println("请输入想产生随机数的个数！");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int[] arrby=new int[999];
        Random random=new Random();
        for (int i = 0; i < n; i++) {
            int j=random.nextInt(1000);
            arrby[j]=j;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+" ");
        }
    }
}