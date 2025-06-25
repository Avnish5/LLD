package z_a_27_flyweight_design_pattern.ARMY;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class ArmyUnitFactory {

    private static final Map<String, Dog> dogFlyWeights = new HashMap<>();
    private static final Map<String, HunterRobot> robotFlyWeights = new HashMap<>();

    public static Dog getDog(String breed, String size) {
        String key = breed + ":" + size;
        dogFlyWeights.putIfAbsent(key, new Dog(breed, size));
        return dogFlyWeights.get(key);
    }

    public static HunterRobot getHunterRobot(String model, String weapon) {
        String key = model + ":" + weapon;
        robotFlyWeights.putIfAbsent(key, new HunterRobot(model, weapon));
        return robotFlyWeights.get(key);
    }
}
