package q_17_atm_design;

public class Card {

    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN_NUMBER = 112211;
    private UserBankAccount userBankAccount;

    public boolean isCorrectedPinEntered(int pin) {
        return pin == PIN_NUMBER;
    }

    public int getBalance() {
        return userBankAccount.balance;
    }

    public void deductBankBalance(int amount) {
        userBankAccount.withdrawalBalance(amount);
    }

    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }
}
