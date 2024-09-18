package SingleResponsibilityPrinciple;

public class UserValidation {
    private final User user;

    public UserValidation(User user) {
        this.user = user;
    }

    public boolean validate() {
        if (user.getName() == null || user.getName().isEmpty()) {
            System.out.println("username can't be empty");
            return false;
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            System.out.println("email can't be empty");
            return false;
        }
        if (!user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            System.out.println("invalid email");
            return false;
        }
        return true;
    }
}
