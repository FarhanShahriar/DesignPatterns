package Coffees;

public class Latte implements Coffee{
    @Override
    public String getName() {
        return "Latte";
    }
    @Override
    public double getCost() {
        return 210.00;
    }
}
