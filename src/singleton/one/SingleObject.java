package singleton.one;

//饿汉式，效率高，但是容易产生垃圾对象
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private  SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
