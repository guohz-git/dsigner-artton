package singleton.three;

//懒汉式,线程安全的，但是效率的

public class SingleObject {
    private static SingleObject instance;
    private SingleObject(){
    }

    public static synchronized  SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
