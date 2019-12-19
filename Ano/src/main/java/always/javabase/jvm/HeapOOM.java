package always.javabase.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-06 14:12
 **/
public class HeapOOM {
    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> list =new ArrayList<OOMObject>();
        while (true){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new OOMObject());
        }
    }
}
