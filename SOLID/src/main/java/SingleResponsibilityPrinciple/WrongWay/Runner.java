package SingleResponsibilityPrinciple.WrongWay;

public class Runner {
    public static void main(String[] args) {
        WrongImplementation wrongImplementation = new WrongImplementation("farhan", "farhan@gmail.com");
        boolean valid = wrongImplementation.validate();
        if (valid) {
            wrongImplementation.write();
            System.out.println(wrongImplementation.read());
            wrongImplementation.sendEmail();
        }
    }
}
