package CoffeeDecorators;

import Coffees.Coffee;

public class CoffeeMaker implements Coffee {

    private final Coffee coffee;

    public CoffeeMaker(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

}
