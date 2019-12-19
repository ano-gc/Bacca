package always.javabase.javabase;

public class staticDispatch {
    static abstract class Human{
        public void test(){
            System.out.println("Human test!");
        }
    }
    static class Man extends Human{
        @Override
        public void test(){
            System.out.println("Man test!");
        }
    }
    static class Woman extends Human{
        @Override
        public void test() {
            System.out.println("Woman test!");;
        }
    }
    public void sayHello(Human human){
        System.out.println("Human say Hello");
    }
    public void sayHello(Man man){
        System.out.println("Man say Hello");
    }
    public void sayHello(Woman woman){
        System.out.println("Woman say Hello");
    }

    public static void main(String[] args) {
        Human man=new Man();
        Human woman=new Woman();
        staticDispatch staticDispatch=new staticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
        man.test();
    }
}
