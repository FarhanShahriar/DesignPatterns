package InterfaceSegregationPrinciple;

public class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("printing...");
    }
}
