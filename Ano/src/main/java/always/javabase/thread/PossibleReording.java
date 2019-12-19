package always.javabase.thread;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-11 11:22
 **/
public class PossibleReording {
    static int x=0,y=0;
    static int a=0,b=0;
    public static void main(String[] args) throws InterruptedException {
        Thread one=new Thread(new Runnable() {
            @Override
            public void run() {
                a=1;
                x=b;
            }
        });
        Thread other=new Thread(new Runnable() {
            @Override
            public void run() {
                b=1;
                y=a;
            }
        });
        one.start();
        other.start();
        one.join();
        other.join();
        System.out.println("X："+x+"Y："+y);
    }
}
