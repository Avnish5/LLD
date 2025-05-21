package r_18_composite_design_pattern.calculator_solution;

public class Number implements ArithmeticExpression{
    int value;

    public Number(int value) {
        this.value = value;
    }
    @Override
    public int evaluate() {
        System.out.println("Number value is :" + value);
        return value;
    }
}
