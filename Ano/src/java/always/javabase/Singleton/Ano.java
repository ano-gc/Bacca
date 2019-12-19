/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.Singleton;

public class Ano {
    private String createuser;

    private String achievable(String a){
        return a+":这是万能的";
    }
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Override
    public String toString() {
        return "创建Ano实例:"+createuser;
    }
}
