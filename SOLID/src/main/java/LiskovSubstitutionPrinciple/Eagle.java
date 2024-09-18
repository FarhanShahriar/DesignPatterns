package LiskovSubstitutionPrinciple;

public class Eagle implements Bird, IFly {
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
