package singleton.tow;

//懒汉式,不是线程安全的
public class SingleObject {
    private static SingleObject instance;
    private SingleObject(){
    }

    public static SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
