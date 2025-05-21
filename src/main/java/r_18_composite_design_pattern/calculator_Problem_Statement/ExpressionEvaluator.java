package r_18_composite_design_pattern.calculator_Problem_Statement;

public class ExpressionEvaluator {

    public static int evaluate(Object expr) {
        if (expr instanceof Number) {
            return ((Number) expr).getValue();
        }

        if (expr instanceof Object[]) {
            Object[] expArr = (Object[]) expr;
            String operator = (String) expArr[0];
            Object left = expArr[1];
            Object right = expArr[2];

            switch (operator) {
                case "+":
                    return evaluate(left) + evaluate(right);
                case "-":
                    return evaluate(left) - evaluate(right);
                case "*":
                    return evaluate(left) * evaluate(right);
                case "/":
                    int rightVal = evaluate(right);
                    if (rightVal == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return evaluate(left) / rightVal;
                default:
                    throw new IllegalArgumentException("Unsupported operator: " + operator);
            }
        }

        throw new IllegalArgumentException("Invalid expression format.");
    }
}
