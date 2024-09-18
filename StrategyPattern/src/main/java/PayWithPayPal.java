public class PayWithPayPal implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid with PayPal");
    }
}
