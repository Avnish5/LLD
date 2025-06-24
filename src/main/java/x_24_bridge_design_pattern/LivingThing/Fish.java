package x_24_bridge_design_pattern.LivingThing;

import x_24_bridge_design_pattern.BreathingMechanism.BreathingMechanism;

public class Fish extends LivingThing{
    public Fish(BreathingMechanism mechanism) {
        super(mechanism);
    }

    public void display() {
        System.out.println("I am a fish.");
    }
}
