/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.adapter;

import java.sql.SQLOutput;

public class AmericanSocket implements ThreeSocket {
    @Override
    public void chargingWithThree() {
        System.out.println("AmericanSocket charging by "+voltage()+" voltage");
    }

    @Override
    public int voltage() {
        return 110;
    }
}
