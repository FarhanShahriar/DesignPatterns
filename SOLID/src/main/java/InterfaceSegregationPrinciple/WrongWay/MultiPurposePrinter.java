package InterfaceSegregationPrinciple.WrongWay;

public class MultiPurposePrinter implements Printer{
    @Override
    public void print() {
        System.out.println("printing...");
    }

    @Override
    public void scan() {
        System.out.println("scanning...");
    }

    @Override
    public void fax() {
        System.out.println("faxing...");
    }
}
