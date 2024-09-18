package OpenClosedPrinciple;

public class Square implements Shape {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("square area: " + (width * width));
    }
}
