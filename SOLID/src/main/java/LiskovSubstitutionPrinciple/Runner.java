package LiskovSubstitutionPrinciple;

public class Runner {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();
        Penguin penguin = new Penguin();
        penguin.eat();
        // penguin.fly(); ****not applicable
    }
}
