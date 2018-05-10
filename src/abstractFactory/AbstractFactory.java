package abstractFactory;

/**
 * 抽象工厂用于定义工厂的特种用于对工厂进行分类管理
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
