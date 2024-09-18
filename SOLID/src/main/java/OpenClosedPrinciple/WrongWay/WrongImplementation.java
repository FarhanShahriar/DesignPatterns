package OpenClosedPrinciple.WrongWay;

public class WrongImplementation {
    public void calculateCircleArea(int radius) {
        System.out.println("circle area: " + (Math.PI * radius * radius));
    }

    public void calculateRectangleArea(int height, int width) {
        System.out.println("rectangle area: " + (height * width));
    }

    public void calculateSquareArea(int width) {
        System.out.println("square area: " + (width * width));
    }
}
