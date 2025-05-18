package a_1_solid_principles.liskov;

public class Ostrich implements Bird{

    @Override
    public void eat() {
        System.out.println("Ostrich eats plants");
    }
}
