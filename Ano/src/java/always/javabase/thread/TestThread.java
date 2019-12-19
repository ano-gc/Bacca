package always.javabase.thread;

import java.util.concurrent.Callable;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-26 17:50
 **/
public class TestThread implements Runnable{

    int b=100;

    synchronized void m1() throws InterruptedException{
        b=1000;
        Thread.sleep(500);
        System.out.println("b="+b);
    }

    synchronized void m2() throws InterruptedException{
        Thread.sleep(250);
        b=2000;
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread=new TestThread();
        Thread thread=new Thread(testThread);

        thread.start();
        testThread.m2();
        System.out.println("main thread b="+testThread.b);
    }
    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
