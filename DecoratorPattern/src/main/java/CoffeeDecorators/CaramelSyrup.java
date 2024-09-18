package CoffeeDecorators;

import Coffees.Coffee;

public class CaramelSyrup extends CoffeeMaker {

    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return super.getName() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.00;
    }
}
