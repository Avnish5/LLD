package q_17_atm_design.ATMStates;

import q_17_atm_design.ATM;
import q_17_atm_design.Card;
import q_17_atm_design.TransactionType;

public class SelectOperationState extends ATMState{

    public  SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType) {
            case CASH_WITHDRAWAL -> atm.setCurrentATMState(new CashWithdrawalState());
            case BALANCE_CHECK -> atm.setCurrentATMState(new CheckBalanceState());
            default -> {
                System.out.println("Invalid selection");
                exit(atm);
            }
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    private void showOperations() {
        System.out.println("Please select the option: ");
        TransactionType.showAllTransactionTypes();
    }
}
