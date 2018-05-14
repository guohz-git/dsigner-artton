package prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape.type);

        shape = ShapeCache.getShape("2");
        System.out.println(shape.type);


        shape = ShapeCache.getShape("3");
        System.out.println(shape.type);
    }
}
