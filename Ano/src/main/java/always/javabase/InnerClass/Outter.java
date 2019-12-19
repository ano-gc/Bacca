/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.InnerClass;


public class Outter {

    private String outtername;

    public Inner getInner(){
        return new Inner();
    }
    //可以添加public：都能访问  protected：包下可访问  private：仅外部类可访问  权限修饰符
    class Inner{
        public String innername;
        //无条件访问外部类的成员
        public String getInnername() {
            System.out.println("获得外部类的成员属性outtername:");
            return outtername;
        }

        public void setInnername(String innername) {
            this.innername = innername;
        }
    }

    public String getOuttername() {
        return outtername;
    }

    public void setOuttername(String outtername) {
        this.outtername = outtername;
    }
}
