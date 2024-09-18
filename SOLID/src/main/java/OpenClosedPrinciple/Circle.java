package OpenClosedPrinciple;

public class Circle implements Shape{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("circle area: " + (Math.PI * radius * radius));
    }
}
