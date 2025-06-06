package q_17_atm_design.ATMStates;

import q_17_atm_design.ATM;
import q_17_atm_design.Card;

public class CheckBalanceState extends ATMState {

    public CheckBalanceState() {};

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your current balance is: " + card.getBalance());
        exit(atm);
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
}
