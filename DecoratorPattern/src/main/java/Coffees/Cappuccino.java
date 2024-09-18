package Coffees;

public class Cappuccino implements Coffee{
    @Override
    public String getName() {
        return "Cappuccino";
    }
    @Override
    public double getCost() {
        return 225.00;
    }
}
