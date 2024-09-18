package DepedecyInversionPrinciple.Wrongway;

public class Runner {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.sendNotification();
        notification = new SMSNotification();
        notification.sendNotification();
        notification = new PushNotification();
        notification.sendNotification();
    }
}
