package DepedecyInversionPrinciple.Wrongway;

public class EmailNotification extends Notification{
    @Override
    public void sendNotification() {
        System.out.println("sent email Notification");
    }
}
