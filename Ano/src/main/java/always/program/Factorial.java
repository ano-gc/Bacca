package always.program;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @program: Ano
 * @description: 求解100！的阶乘；输入一个整形N，求解N的阶乘，要求使用递归。
 * @author: Ano
 * @create: 2019-11-29 13:19
 **/
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整形N(输入0退出):");
        int n=scanner.nextInt();
        while(n>0){
            System.out.println("整形"+n+"的阶乘是"+factorialRecursive(n));
            System.out.println("请输入一个整形N:");
            n=scanner.nextInt();
        }
    }
    public static BigDecimal factorialRecursive(int n){
        if(n>1){
            BigDecimal bigDecimal=factorialRecursive(n-1);
            return bigDecimal.multiply(new BigDecimal(n));
        }
        if(n==1){
            return new BigDecimal(1);
        }
        return null;
    }
}
