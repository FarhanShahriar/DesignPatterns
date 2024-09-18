package Coffees;

public class Espresso implements Coffee{
    @Override
    public String getName() {
        return "Espresso";
    }
    @Override
    public double getCost() {
        return 180.00;
    }
}
