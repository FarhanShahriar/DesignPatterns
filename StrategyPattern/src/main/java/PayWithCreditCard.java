public class PayWithCreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid with Credit Card");
    }
}
