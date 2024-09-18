public class NotificationFactory {
    Notification createNotification(int notificationType) {
        if (notificationType == 1) return new SMSNotification();
        else if (notificationType == 2) return new EmailNotification();
        else if (notificationType == 3) return new MobileNotification();
        return null;
    }
}
