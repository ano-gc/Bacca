/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.ioliu;

import java.io.*;

//编写一个程序实现如下功能，从当前目录下的文件fin.txt中读取n个字节（实际读到的字节数可能比80少）
// 并将读来的字节写入当前目录下的文件fout.txt中
public class ReadIoliu {
    public static void main(String[] args) {
        File f1 = new File("src\\fin.txt");
        File f2 = new File("src\\fou.txt");
        if (!f1.exists()) {
            try {
                f1.createNewFile();
                System.out.println("fin.txt文件创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("fin.txt文件已存在！");
        }
        if (!f2.exists()) {
            try {
                f2.createNewFile();
                System.out.println("fou.txt文件创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("fou.txt文件已创建！");
        }

        try {
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);

            byte[] temp = new byte[10];

            fis.read(temp);
            for (byte c : temp) {
                System.out.print(c);
            }
            fos.write(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
