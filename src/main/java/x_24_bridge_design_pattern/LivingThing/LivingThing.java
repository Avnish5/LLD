package x_24_bridge_design_pattern.LivingThing;

import x_24_bridge_design_pattern.BreathingMechanism.BreathingMechanism;

public abstract  class LivingThing {
    protected BreathingMechanism breathingMechanism;

    public LivingThing(BreathingMechanism mechanism) {
        this.breathingMechanism = mechanism;
    }

    public void breathe() {
        breathingMechanism.breathe();
    }

    abstract void display();
}
