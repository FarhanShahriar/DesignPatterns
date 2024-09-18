package SingleResponsibilityPrinciple;

public class WelcomeEmail {
    public void sendEmail(User user) {
        System.out.println("sent welcome mail to: " + user.getEmail());
    }
}
