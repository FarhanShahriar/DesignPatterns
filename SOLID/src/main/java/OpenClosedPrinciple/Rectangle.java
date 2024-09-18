package OpenClosedPrinciple;

public class Rectangle implements Shape{
    private int height;
    private int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("rectangle area: " + (height * width));
    }
}
