public class Adapter extends OldPaymentGateway {
    private final NewPaymentGateway newPaymentGateway;

    public Adapter() {
        newPaymentGateway = new NewPaymentGateway();
    }

    @Override
    public void processPayment(int amount) {
        newPaymentGateway.makeTransaction(amount);
    }
}
