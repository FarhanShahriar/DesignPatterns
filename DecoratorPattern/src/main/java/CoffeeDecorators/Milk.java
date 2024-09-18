package CoffeeDecorators;

import Coffees.Coffee;

public class Milk extends CoffeeMaker{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return super.getName() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.00;
    }
}
