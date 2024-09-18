package OpenClosedPrinciple.WrongWay;

public class Runner {
    public static void main(String[] args) {
        WrongImplementation wrongImplementation = new WrongImplementation();
        wrongImplementation.calculateCircleArea(3);
        wrongImplementation.calculateRectangleArea(5, 6);
        wrongImplementation.calculateSquareArea(7);
    }
}
