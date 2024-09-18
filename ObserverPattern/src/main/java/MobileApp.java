public class MobileApp implements Observer{
    private final String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void doNotify(int amount) {
        System.out.println("notifying " + name + " via MobileApp!");
        System.out.println("new price is : " + amount);
    }
}
