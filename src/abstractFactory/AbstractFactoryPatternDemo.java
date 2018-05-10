package abstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapleFactoy = FactoryProducer.getFactory("SHAPE");
        //获取circle
        Shape circle = shapleFactoy.getShape("CIRCLE");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.fill();

    }
}
