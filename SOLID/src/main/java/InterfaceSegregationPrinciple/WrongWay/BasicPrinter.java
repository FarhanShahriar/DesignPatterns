package InterfaceSegregationPrinciple.WrongWay;

public class BasicPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("printing...");
    }

    @Override
    public void scan() {
        System.out.println("can not scan!!!");
    }

    @Override
    public void fax() {
        System.out.println("can not fax!!!");
    }
}
