package LiskovSubstitutionPrinciple.WrongWay;

public class Sparrow implements Bird{
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
