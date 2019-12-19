/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.ioliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestIoliu {
    public static void main(String[] args) {
        try {
            InputStream in=new FileInputStream("Serialization.txt");
            byte[] buff=new byte[1024];
            int hasnumber=0;
            for (int i = 0; i < 20; i++) {
                System.out.println(i+":"+in.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



