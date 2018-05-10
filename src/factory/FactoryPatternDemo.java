package factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
    }
}
