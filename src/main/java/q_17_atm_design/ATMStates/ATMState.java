package q_17_atm_design.ATMStates;

import q_17_atm_design.ATM;
import q_17_atm_design.Card;
import q_17_atm_design.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS! Something went wrong");
    }

    public void authenticatePIN(ATM atm, Card card, int pin) {
        System.out.println("OOPS! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("OOPS! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount) {
        System.out.println("OOPS! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPS! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }

}
