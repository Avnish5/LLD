package t_20_lld_splitwise.Expense;

import t_20_lld_splitwise.BalanceSheetController;
import t_20_lld_splitwise.Expense.Split.Split;
import t_20_lld_splitwise.ExpenseSplit;
import t_20_lld_splitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, User paidByUser, ExpenseSplitType splitType, List<Split> splitDetails) {
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser,splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser,splitDetails, expenseAmount);
        return expense;
    }
}
