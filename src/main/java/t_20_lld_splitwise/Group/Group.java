package t_20_lld_splitwise.Group;

import t_20_lld_splitwise.Expense.Expense;
import t_20_lld_splitwise.Expense.ExpenseController;
import t_20_lld_splitwise.Expense.ExpenseSplitType;
import t_20_lld_splitwise.Expense.Split.Split;
import t_20_lld_splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupID;
    String groupName;
    List<User> groupMembers;
    List<Expense> expenseList;
    ExpenseController expenseController;

    Group() {
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User member) {
        groupMembers.add(member);
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, User paidByUser, ExpenseSplitType splitType, List<Split> splitDetails) {
        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser,splitType, splitDetails);
        expenseList.add(expense);
        return expense;
    }
}
