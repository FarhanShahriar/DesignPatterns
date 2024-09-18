public class WebDashboard implements Observer{
    private final String name;

    public WebDashboard(String name) {
        this.name = name;
    }

    @Override
    public void doNotify(int amount) {
        System.out.println("notifying " + name + " via WebDashboard!");
        System.out.println("new price is : " + amount);
    }
}
