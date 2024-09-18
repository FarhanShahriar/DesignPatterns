package InterfaceSegregationPrinciple.WrongWay;

public class Runner {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
        basicPrinter.scan();
        basicPrinter.fax();

        MultiPurposePrinter multiPurposePrinter = new MultiPurposePrinter();
        multiPurposePrinter.print();
        multiPurposePrinter.scan();
        multiPurposePrinter.fax();
    }
}
