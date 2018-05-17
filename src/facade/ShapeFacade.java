package facade;

public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }


}
