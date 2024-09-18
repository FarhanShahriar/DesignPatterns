package LiskovSubstitutionPrinciple;

public class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}
