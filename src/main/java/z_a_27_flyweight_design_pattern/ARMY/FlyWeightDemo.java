package z_a_27_flyweight_design_pattern.ARMY;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightDemo {

    public static void main(String[] args) {
        // Army holding units and their positions (extrinsic data)
        Map<ArmyUnit, Position> army = new HashMap<>();

        // Define some dog types (intrinsic)
        String[][] dogTypes = {{"German Shepherd", "Large"}, {"Bulldog", "Medium"}, {"Beagle", "Small"}};

        // Create 1000 dogs using flyweight factory
        for (int i = 0; i < 1000; i++) {
            String breed = dogTypes[i % dogTypes.length][0];
            String size = dogTypes[i % dogTypes.length][1];
            Dog dog = ArmyUnitFactory.getDog(breed, size);
            Position position = new Position(i, i * 2);  // extrinsic state
            army.put(dog, position);
        }

        // Define hunter robot types
        String[][] robotTypes = {{"X1", "Laser"}, {"X2", "Plasma"}};

        // Create 1000 hunter robots using flyweight factory
        for (int i = 0; i < 1000; i++) {
            String model = robotTypes[i % robotTypes.length][0];
            String weapon = robotTypes[i % robotTypes.length][1];
            HunterRobot robot = ArmyUnitFactory.getHunterRobot(model, weapon);
            Position position = new Position(i * 3, i * 4); // extrinsic state
            army.put(robot, position);
        }

        // Display first 5 units
        army.entrySet().stream().limit(5).forEach(entry -> {
            entry.getKey().display(entry.getValue());
        });

    }
}
