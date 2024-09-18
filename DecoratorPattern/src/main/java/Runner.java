import CoffeeDecorators.CaramelSyrup;
import CoffeeDecorators.Milk;
import CoffeeDecorators.Sugar;
import CoffeeDecorators.WhippedCream;
import Coffees.Cappuccino;
import Coffees.Coffee;
import Coffees.Espresso;
import Coffees.Latte;

public class Runner {
    public static void main(String[] args) {
        Coffee coffee = new Cappuccino();
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        coffee = new Milk(coffee);
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        coffee = new Sugar(coffee);
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        System.out.println("=========================================");
        coffee = new Latte();
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        coffee = new WhippedCream(coffee);
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        coffee = new CaramelSyrup(coffee);
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        coffee = new Sugar(coffee);
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        coffee = new Sugar(coffee);
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        System.out.println("=========================================");
        coffee = new Espresso();
        System.out.println(coffee.getName() + ": " + coffee.getCost());
        coffee = new Milk(coffee);
        System.out.println(coffee.getName() + ": " + coffee.getCost());

    }
}
