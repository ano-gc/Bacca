/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.adapter;

public class Iphone {

    public Iphone(){
        System.out.println("welcome to use iphone！");
    }

    public void plugin(TwoSocket twoSocket){
        twoSocket.chargingWithTwo();
    }

    public static void main(String[] args) {
        String s= new String("abdc");
        Iphone iphone=new Iphone();
        iphone.plugin(new ChineseAdapter());
    }
}
