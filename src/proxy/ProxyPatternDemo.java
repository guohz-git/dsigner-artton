package proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        //图像从磁盘加载显示
        image.display();
        //已加载就不需要重新加载图片了

        image.display();
    }
}
