package z_a_27_flyweight_design_pattern.ARMY;

// Concrete Flyweight for DogRobot
public class Dog implements ArmyUnit{

    private final String breed; // intrinsic state
    private final String size; // intrinsic state

    public Dog(String breed, String size) {
        this.breed = breed;
        this.size = size;
    }

    @Override
    public void display(Position position) {
        System.out.println("Dog [Breed: " + breed + ", Size: " + size + "] at Position: " + position);
    }
}
