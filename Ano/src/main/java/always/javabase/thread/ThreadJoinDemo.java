package always.javabase.thread;

import org.junit.Test;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-12 09:09
 **/
public class ThreadJoinDemo {
    //通过子程序join使线程按顺序执行
    @Test
    public void Test1() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1开始执性！");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                    System.out.println("线程1执性结束！");
                    System.out.println("线程2开始执性！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                    System.out.println("线程2执性结束！");
                    System.out.println("线程3开始执性！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread3.start();
        thread2.start();
        thread1.start();
    }

    @Test
    public void test2() throws InterruptedException {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        thread1.start();
        System.out.println("线程1开始执性!");
        thread1.join();
        System.out.println("线程1结束执性!");
        System.out.println("线程2开始执性!");
        thread2.start();
        thread2.join();
        System.out.println("线程2结束执性!");
        System.out.println("线程3开始执性!");
        thread3.start();
    }
}
