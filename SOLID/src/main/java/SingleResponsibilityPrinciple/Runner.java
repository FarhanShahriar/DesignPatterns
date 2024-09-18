package SingleResponsibilityPrinciple;

public class Runner {
    public static void main(String[] args) {
        User user = new User("farhan", "farhan@gmail.com");
        User user2 = new User("niloy", "niloy.com");
        performAction(user);
        System.out.println("==========================================");
        performAction(user2);
    }

    private static void performAction(User user) {
        UserValidation validation = new UserValidation(user);
        boolean validUser = validation.validate();
        if (validUser) {
            DB db = new DB();
            db.write(user);
            User returnedUser = db.read();
            System.out.println("returned user name: " + returnedUser.getName() + ", returned user email: " + returnedUser.getEmail() + ".");
            WelcomeEmail welcomeEmail = new WelcomeEmail();
            welcomeEmail.sendEmail(returnedUser);
        }
    }
}
