import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        PayWithCreditCard payWithCreditCard = new PayWithCreditCard();
        PayWithPayPal payWithPayPal = new PayWithPayPal();
        PayWithBitcoin payWithBitcoin = new PayWithBitcoin();
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("please choose a payment type!");
            System.out.println("1. Credit Card\n" +
                    "2. PayPal\n" +
                    "3. Bitcoin");
            Scanner sc = new Scanner(System.in);
            System.out.print("press the number of your payment type: ");
            int paymentType;
            try {
                paymentType = sc.nextInt();
            } catch (Exception e) {
                System.out.println("must be a number between 1 & 3");
                System.out.println("=======================================================");
                Thread.sleep(3000L);
                continue;
            }
            if (paymentType == 1) payWithCreditCard.pay();
            else if (paymentType == 2) payWithPayPal.pay();
            else if (paymentType == 3) payWithBitcoin.pay();
            else System.out.println("you did not choose the correct payment method");
            System.out.println("=======================================================");
            Thread.sleep(3000L);
        }
        System.out.println("!!!!thanks for using the program!!!!");
    }
}
