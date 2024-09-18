package DepedecyInversionPrinciple;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sent sms Notification");
    }
}
