import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        NotificationFactory factory = new NotificationFactory();
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("please choose a notification type!");
            System.out.println("1. SMS\n" +
                    "2. Email\n" +
                    "3. Push");
            Scanner sc = new Scanner(System.in);
            System.out.print("press the number of your notification type: ");
            int notificationType;
            try {
                notificationType = sc.nextInt();
            } catch (Exception e) {
                System.out.println("must be a number between 1 & 3");
                System.out.println("=======================================================");
                Thread.sleep(3000L);
                continue;
            }
            Notification notification = factory.createNotification(notificationType);
            if (notification != null) notification.sendNotification();
            else System.out.println("you did not choose the correct Notification Type");
            System.out.println("=======================================================");
            Thread.sleep(3000L);
        }
        System.out.println("!!!!thanks for using the program!!!!");
    }
}
