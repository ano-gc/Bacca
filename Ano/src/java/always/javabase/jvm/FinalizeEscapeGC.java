package always.javabase.jvm;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-07 10:13
 **/
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK=null;
    public void isAlive(){
        System.out.println("I am still Alive:");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK=this;
    }

    public static void main(String[] args) {
        SAVE_HOOK=new FinalizeEscapeGC();
        SAVE_HOOK=null;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("I am dead！");
        }

    }
}
