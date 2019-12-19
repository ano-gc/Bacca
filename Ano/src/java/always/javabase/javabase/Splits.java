/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.javabase;

public class Splits {
    private String s;

    public Splits(String s) {
        this.s = s;
    }

    public String[] getStr(String s){
        String[] str_string=s.split("\\d");
        return str_string;
    }

    public int[] getNum(){
        String[] str_String=s.split("\\D");
        String a="";
        for (String m :
                str_String) {
            a+=m;
        }
        String[] num=a.split(" ");
        int[] b=new int[num.length];
        for (int i = 0; i < num.length; i++) {
            b[i]=Integer.parseInt(num[i]);
        }
       return b;
    }

    //打印字符串中的字母
    public void printStr(String s){
        String a = "";
        for(String n : getStr(s)){
            a += n;
        }
        System.out.println(a);
    }
    //打印字符串中的数字
    public void printNum(){
        String a = "";
        for(int n : getNum()){
            a += n;
        }
        System.out.println(a);
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
