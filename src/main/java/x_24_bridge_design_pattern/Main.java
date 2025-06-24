package x_24_bridge_design_pattern;

import x_24_bridge_design_pattern.BreathingMechanism.Gills;
import x_24_bridge_design_pattern.BreathingMechanism.Lungs;
import x_24_bridge_design_pattern.LivingThing.Fish;
import x_24_bridge_design_pattern.LivingThing.LivingThing;

public class Main {
    public static void main(String[] args) {
        LivingThing lungFish = new Fish(new Lungs());
        LivingThing normalFish = new Fish(new Gills());

        lungFish.breathe();
        normalFish.breathe();
    }
}
