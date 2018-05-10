package factory;

/**
 * 工厂模式实现类：
 *  用于构造复杂类，提高扩展性
 */
public class ShapeFactory {
    //使用 getShape方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
