package r_18_composite_design_pattern.calculator_Problem_Statement;


public class Main {

    public static void main(String[] args) {
        // Expression: ((3 + 5) * (10 - 4)) / 2
        Object expr = new Object[] {
                "/",
                new Object[] {
                        "*",
                        new Object[] { "+", new Number(3), new Number(5) },
                        new Object[] { "-", new Number(10), new Number(4) }
                },
                new Number(2)
        };

        int result = ExpressionEvaluator.evaluate(expr);
        System.out.println("Result: " + result); // Should print 24
    }
}
