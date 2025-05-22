package q_17_atm_design.ATMStates;

import q_17_atm_design.ATM;
import q_17_atm_design.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
