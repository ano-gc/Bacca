package always.datastructure.thread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class SpliteratorThread {
    AtomicInteger atomicInteger=new AtomicInteger(0);
    List<String> list=createList();
    Spliterator spliterator=list.spliterator();

    @Test
    public void spliteratorTest(){
        for (int i = 0; i < 4; i++) {
            new CreateThread().start();
        }
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结果为："+atomicInteger);
    }

    private List<String> createList() {
        List<String> result=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if(i%10==0){
                result.add(String.valueOf(i));
            }else{
                result.add("a");
            }
        }
        return result;
    }

    class CreateThread extends Thread{
        @Override
        public void run() {
            String threadName=Thread.currentThread().getName();
            System.out.println("线程"+threadName+"开始执行......");
            spliterator.trySplit().forEachRemaining(new Consumer() {
                @Override
                public void accept(Object o) {
                    if(isInteger((String)o)){
                        int num=Integer.parseInt(o+"");
                        atomicInteger.addAndGet(num);
                        System.out.println("数值："+num+"------"+threadName);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            System.out.println("线程"+threadName+"运行结束......");
        }
    }

    private static boolean isInteger(String o) {
        Pattern pattern=Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(o).matches();
    }
}
