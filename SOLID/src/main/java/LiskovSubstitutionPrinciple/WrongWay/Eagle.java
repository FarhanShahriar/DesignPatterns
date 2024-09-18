package LiskovSubstitutionPrinciple.WrongWay;

public class Eagle implements Bird{
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
