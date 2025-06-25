package z_a_27_flyweight_design_pattern.ARMY;

// Concrete Flyweight for HunterRobot
public class HunterRobot implements ArmyUnit{

    private final String model; // intrinsic state
    private final String weapon; // intrinsic state

    public HunterRobot(String model, String weapon) {
        this.model = model;
        this.weapon = weapon;
    }

    @Override
    public void display(Position position) {
        System.out.println("HunterRobot [Model: " + model + ", Weapon: " + weapon + "] at Position: " + position);
    }
}
