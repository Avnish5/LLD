package q_17_atm_design.ATMStates;

import q_17_atm_design.ATM;
import q_17_atm_design.AmountWithdrawl.CashWithdrawProcessor;
import q_17_atm_design.AmountWithdrawl.FiveHundredWithdrawProcessor;
import q_17_atm_design.AmountWithdrawl.OneHundredWithdrawProcessor;
import q_17_atm_design.AmountWithdrawl.TwoThousandWithdrawProcessor;
import q_17_atm_design.Card;

public class CashWithdrawalState extends ATMState{

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount) {

        if (atm.getAtmBalance() < withdrawalAmount) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if (card.getBalance() < withdrawalAmount) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {
            card.deductBankBalance(withdrawalAmount);
            atm.deductATMBalance(withdrawalAmount);

            CashWithdrawProcessor cashWithdrawProcessor = new TwoThousandWithdrawProcessor(
                    new FiveHundredWithdrawProcessor( new OneHundredWithdrawProcessor(null))
            );

            cashWithdrawProcessor.withDraw(atm, withdrawalAmount);
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
