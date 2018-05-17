package decorator;

public abstract class ShapeDecorator implements Shape {
    protected  Shape decoratorShap ;

    public ShapeDecorator(Shape shape){
        this.decoratorShap = shape;
    }

    public void draw(){
        decoratorShap.draw();
    }

    public abstract void setRedBorder(Shape decoratorShap);
}
