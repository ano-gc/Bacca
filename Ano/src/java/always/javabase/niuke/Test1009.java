/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.niuke;

import static javafx.scene.input.KeyCode.V;

public class Test1009 {
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }

    static class A{
        protected int value;
        public  A(int v){
            setValue(v);
        }
        public void setValue(int value){
            this.value=value;
        }
        public int getValue(){
            try {
                value++;
                return value;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B(){
            super(5);
            setValue(getValue()-3);
        }
        public void setValue(int value){
            super.setValue(2*value);
        }
    }
}
