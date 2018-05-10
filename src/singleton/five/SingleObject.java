package singleton.five;

//登记类，静态内部类

public class SingleObject {
    private  static class SingletonHodler{
        private static final SingleObject INSTANCE = new SingleObject();
    }

    private SingleObject(){}

    public static final synchronized SingleObject getInstance(){
        return SingletonHodler.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
