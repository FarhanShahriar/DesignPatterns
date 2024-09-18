package InterfaceSegregationPrinciple;

public class Runner {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();

        MultiPurposePrinter multiPurposePrinter = new MultiPurposePrinter();
        multiPurposePrinter.print();
        multiPurposePrinter.scan();
        multiPurposePrinter.fax();
    }
}
