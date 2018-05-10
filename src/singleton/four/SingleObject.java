package singleton.four;

//双检索，使用原子对象，是线程安全，也是延迟加载的，实现较复杂

public class SingleObject {
    private volatile static SingleObject instance;
    private SingleObject(){
    }

    public static synchronized SingleObject getInstance(){
        if(instance == null){
           synchronized (SingleObject.class){
               instance = new SingleObject();
           }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
