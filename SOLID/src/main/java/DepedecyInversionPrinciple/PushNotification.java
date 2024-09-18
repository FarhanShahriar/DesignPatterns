package DepedecyInversionPrinciple;

public class PushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sent push Notification");
    }
}
