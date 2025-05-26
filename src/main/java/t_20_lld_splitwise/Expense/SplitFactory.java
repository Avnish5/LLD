package t_20_lld_splitwise.Expense;

import t_20_lld_splitwise.Expense.Split.EqualExpenseSplit;
import t_20_lld_splitwise.Expense.Split.PercentageExpenseSplit;
import t_20_lld_splitwise.Expense.Split.Split;
import t_20_lld_splitwise.Expense.Split.UnequalExpenseSplit;
import t_20_lld_splitwise.ExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType expenseSplitType) {
        switch (expenseSplitType) {
            case EQUAL -> { return new EqualExpenseSplit();}
            case UNEQUAL -> {return new UnequalExpenseSplit();}
            case PERCENTAGE -> {return new PercentageExpenseSplit();}
            default -> {return null;}
        }
    }
}
