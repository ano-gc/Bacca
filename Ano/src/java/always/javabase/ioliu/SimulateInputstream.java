/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.ioliu;

import java.io.Closeable;
import java.io.IOException;

public abstract class SimulateInputstream implements Closeable {

    private static final int SKIP_BUFFER_SIZE = 2048;//用于skip方法，和skipBuffer相关

    private static byte[] skipBuffer;

    //从输入流中读取下一个字节，正常返回0-255，到达文件的末尾返回-1;
    // 在流中还有数据，但是没有读到的时候方法会阻塞（block）;
    //抽象方法，不同的子类有不同的实现
    public abstract int read() throws IOException;

    //将流中的数据放入byte数组中第off位置长len个字节
    public int read(byte b[], int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }
        //检查输入是否正常，一般情况下是方法设计的第一步
        int c = read();
        if (c == -1) {
            return -1;
        }
        b[off] = (byte) c;
        int i = 1;
        try {
            for (; i < len; i++) {
                c = read();
                if (c == -1) {
                    break;
                }
                b[off + i] = (byte) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    //利用抽象方法read,某种意义上是简单的Template模式
    public int read(byte b[])throws IOException{
        return read(b,0,b.length);
    }

    public long skip(long n) throws IOException {
        long remaining = n;//方法内部使用的、表示要跳过的字节数目，使用它完成一系列字节读取的循环
        int nr;
        if (skipBuffer == null)
            skipBuffer = new byte[SKIP_BUFFER_SIZE];         //初始化一个跳转的缓存
        byte[] localSkipBuffer = skipBuffer;                 //本地化的跳转缓存
        if (n <= 0) {    return 0;      }                    //检查输入参数，应该放在方法的开始
        while (remaining > 0) {                              //一共要跳过n个，每次跳过部分，循环
            nr = read(localSkipBuffer, 0, (int) Math.min(SKIP_BUFFER_SIZE, remaining));
            //利用上面的read(byte[],int,int)方法尽量读取n个字节
            if (nr < 0) {  break;    }                       //读到流的末端，则返回
            remaining -= nr;                                 //没有完全读到需要的，则继续循环
        }
        return n - remaining;                                //返回时要么全部读完，要么因为到达文件末端，读取了部分
    }

    //查询流中还有多少可以读取的字节
    public int available()throws IOException{
        return 0;
    }
    //该方法不会block。在java中抽象类方法的实现一般有以下几种方式：

    //1.抛出异常（java.util）；
    //2.“弱”实现，像上面这种子类在必要的时候覆盖它
    //3.“空”实现，下面有例子。

    //关闭当前流、同时释放与此流相关的资源
    public void close() throws IOException{}

    //在当前位置对流进行标记，必要的时候可以使用reset方法返回
    //markSupport可以查询当前流是否支持mark
    public synchronized void mark(int readlimit){}

    //对mark过的流进行复位，只有当流支持mark时才可以使用此方法。
    public synchronized void reset()throws IOException{
        throw new IOException("mark/reset not supported");
    }

    //查询是否支持mark
    public boolean markSupported(){
        return false;
    }
}

