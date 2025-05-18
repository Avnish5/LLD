package e_5_decorator_design_pattern;

import e_5_decorator_design_pattern.decorator.ExtraCheese;
import e_5_decorator_design_pattern.decorator.Mushroom;
import e_5_decorator_design_pattern.model.BasePizza;
import e_5_decorator_design_pattern.model.Margherita;

public class PizzaDecoratorExample {

    public static void main(String[] args) {

        BasePizza pizza = new Margherita();
        System.out.println(pizza.cost());

        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.cost());

        pizza = new Mushroom(pizza);
        System.out.println(pizza.cost());

        System.out.println(12 / 6);

    }
}
