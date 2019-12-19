/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.adapter;

public class ChineseAdapter implements TwoSocket {
    private ThreeSocket threeSocket;

    public ChineseAdapter(){
        threeSocket=new AmericanSocket();
    }

    @Override
    public void chargingWithTwo() {
        threeSocket.chargingWithThree();
    }

    @Override
    public int voltage() {
        return threeSocket.voltage();
    }
}
