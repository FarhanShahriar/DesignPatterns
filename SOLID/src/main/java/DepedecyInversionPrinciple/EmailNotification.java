package DepedecyInversionPrinciple;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sent email Notification");
    }
}
