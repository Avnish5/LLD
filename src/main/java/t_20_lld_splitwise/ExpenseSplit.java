package t_20_lld_splitwise;

import t_20_lld_splitwise.Expense.Split.Split;

import java.util.List;

public interface ExpenseSplit {

    public void validateSplitRequest(List<Split> splitList, double totalAmount);
}
