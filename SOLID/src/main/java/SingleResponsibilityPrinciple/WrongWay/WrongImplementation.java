package SingleResponsibilityPrinciple.WrongWay;

public class WrongImplementation {
    private final String name;
    private final String email;

    public WrongImplementation(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public boolean validate() {
        if (name == null || name.isEmpty()) {
            System.out.println("username can't be empty");
            return false;
        }
        if (email == null || email.isEmpty()) {
            System.out.println("email can't be empty");
            return false;
        }
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("invalid email");
            return false;
        }
        return true;
    }

    public String read() {
        System.out.println("database read operation performed");
        return "name: " + name + ", email: " + email + ".";
    }

    public void write() {
        System.out.println("database write operation performed");
        System.out.println("name: " + name + ", email: " + email + ".");
    }

    public void sendEmail() {
        System.out.println("sent welcome mail to: " + email);
    }
}
