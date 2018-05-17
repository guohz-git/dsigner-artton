package decorator;

public  class RedShapeDecorator extends   ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public  void setRedBorder(){
        System.out.println("Red Border");
    }

    @Override
    public void draw() {
        decoratorShap.draw();
        setRedBorder(decoratorShap);
    }

    @Override
    public void setRedBorder(Shape decoratorShap) {
        System.out.println("Border Color: Red");
    }
}
