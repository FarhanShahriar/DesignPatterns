package LiskovSubstitutionPrinciple.WrongWay;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Eagle();
        bird.eat();
        bird.fly();
        bird = new Sparrow();
        bird.eat();
        bird.fly();
        bird = new Penguin();
        bird.eat();
        bird.fly();
    }
}
