package CoffeeDecorators;

import Coffees.Coffee;

public class WhippedCream extends CoffeeMaker{

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return super.getName() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 12.50;
    }
}
