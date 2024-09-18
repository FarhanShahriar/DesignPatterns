package CoffeeDecorators;

import Coffees.Coffee;

public class Sugar extends CoffeeMaker{

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return super.getName() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.50;
    }
}
