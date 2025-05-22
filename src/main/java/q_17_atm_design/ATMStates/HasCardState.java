package q_17_atm_design.ATMStates;

import q_17_atm_design.ATM;
import q_17_atm_design.Card;

public class HasCardState extends ATMState{

    public HasCardState() {
        System.out.println("Enter your card pin: ");
    }

    @Override
    public void authenticatePIN(ATM atm, Card card, int pin) {
        boolean isCorrectedPin = card.isCorrectedPinEntered(pin);

        if(isCorrectedPin) {
            atm.setCurrentATMState(new SelectOperationState());
        } else {
            System.out.println("Invalid Pin");
            exit(atm);
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
}
