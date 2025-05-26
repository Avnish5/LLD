package t_20_lld_splitwise.User;

import t_20_lld_splitwise.UserExpenseBalanceSheet;

public class User {

    String userId;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String userId, String userName, UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userId = userId;
        this.userName = userName;
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

    public String getUserId() {
        return userId;
    }
}
