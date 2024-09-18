package LiskovSubstitutionPrinciple.WrongWay;

public class Penguin implements Bird{
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void fly() {
        System.out.println("Sorry!!!! Penguin can't flying!!!");
        throw new PenguinCanNotFlyException();
    }
}
