package a_1_solid_principles.liskov;

public class Parrot implements FlyingBird{
    @Override
    public void fly() {
        System.out.println("Parrot eats seeds");
    }

    @Override
    public void eat() {
        System.out.println("Parrot flies");
    }
}
