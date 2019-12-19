package always.datastructure.thread;

/**
 * @program: springboot
 * @description:
 * @author: Ano
 * @create: 2019-10-16 13:31
 **/
public class ThreadToControllerCPU extends Thread{



    public static void main(String[] args) {
        ThreadToControllerCPU threadToControllerCPU=new ThreadToControllerCPU();
        threadToControllerCPU.start();
        for (;;){
            for (int i = 0; i < 96000000; i++) {
            }
            try {
                threadToControllerCPU.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
