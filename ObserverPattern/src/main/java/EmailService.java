public class EmailService implements Observer{
    private final String name;

    public EmailService(String name) {
        this.name = name;
    }

    @Override
    public void doNotify(int amount) {
        System.out.println("notifying " + name + " via EmailService!");
        System.out.println("new price is : " + amount);
    }
}
