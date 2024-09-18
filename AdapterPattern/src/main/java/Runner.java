public class Runner {
    public static void main(String[] args) {
        OldPaymentGateway oldPaymentGateway = new OldPaymentGateway();
        oldPaymentGateway.processPayment(100);
        oldPaymentGateway.processPayment(200);

        oldPaymentGateway = new Adapter();

        oldPaymentGateway.processPayment(300);
        oldPaymentGateway.processPayment(400);
    }
}
