package always.javabase.Singleton;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-11 11:01
 **/
public class AnoDoubleCheck {

    private AnoDoubleCheck(){};

    private static volatile AnoDoubleCheck instance=null;
    //运行时加载对象
    public AnoDoubleCheck getInstance(){
        if(instance==null){
            synchronized (AnoDoubleCheck.class){
                if(instance==null){
                    instance=new AnoDoubleCheck();
                }
            }
        }
        return instance;
    }
}
