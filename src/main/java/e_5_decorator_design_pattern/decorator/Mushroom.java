package e_5_decorator_design_pattern.decorator;

import e_5_decorator_design_pattern.model.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 220;
    }
}
