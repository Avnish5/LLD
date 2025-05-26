package t_20_lld_splitwise.Expense.Split;

import t_20_lld_splitwise.ExpenseSplit;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) {
        double amountShouldBePresent = totalAmount / splitList.size();

        for (Split split : splitList) {
            if (split.getAmountOwe() != amountShouldBePresent) {
                //throw exception
            }
        }
    }
}
