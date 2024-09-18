package OpenClosedPrinciple;

public class Runner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        rectangle.calculateArea();
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.calculateArea();
        Square square = new Square();
        square.setWidth(5);
        square.calculateArea();
    }
}
