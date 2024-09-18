package SingleResponsibilityPrinciple;

public class DB {
    private User user;

    public User read() {
        System.out.println("read operation performed");
        return user;
    }

    public void write(User user) {
        this.user = user;
        System.out.println("write operation performed");
        System.out.println("name: " + user.getName() + ", email: " + user.getEmail() + ".");
    }
}
