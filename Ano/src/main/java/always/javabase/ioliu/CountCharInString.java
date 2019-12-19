package always.javabase.ioliu;

import java.util.Scanner;

/**
 * @program: Ano
 * @description: 统计字符创中各种字符的个数
 * @author: Ano
 * @create: 2019-11-29 14:44
 **/
public class CountCharInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char[] c=str.toCharArray();
        int zcount=0;int ncount=0;int kcount=0;int other=0;
        for (int i = 0; i < c.length; i++) {
            if('0'<=c[i]&&c[i]<='9'){
                ncount++;
            }else if(('a'<=c[i]&&c[i]<='z')||('A'<=c[i]&&c[i]<='Z')){
                zcount++;
            }else if(c[i]==' ') {
                kcount++;
            }else{
                other++;
            }
        }
        System.out.println(zcount+"/"+ncount+"/"+kcount+"/"+other);
    }
}
