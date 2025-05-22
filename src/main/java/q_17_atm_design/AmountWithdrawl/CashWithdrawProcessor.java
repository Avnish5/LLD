package q_17_atm_design.AmountWithdrawl;

import q_17_atm_design.ATM;

public abstract  class CashWithdrawProcessor {

    CashWithdrawProcessor nextCashWithdrawProcessor;

   CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        this.nextCashWithdrawProcessor = nextCashWithdrawProcessor;
    }

    public void withDraw(ATM atm, int remainingAmount) {
       if(nextCashWithdrawProcessor != null) {
           nextCashWithdrawProcessor.withDraw(atm,remainingAmount);
       }
    }
}
