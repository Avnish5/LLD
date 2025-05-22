package q_17_atm_design.AmountWithdrawl;

import q_17_atm_design.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{

    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withDraw(ATM atm, int remainingAmount) {
        int required = remainingAmount / 500;
        int availableNotes = atm.getNoOfFiveHundredNotes();

        if (required > 0) {
            if (required <= availableNotes) {
                // Can dispense all required 500 notes
                atm.deductFiveHundredNotes(required);
                remainingAmount = remainingAmount % 500; // Only remainder left
            } else if (availableNotes > 0) {
                // Can only dispense some 500 notes
                atm.deductFiveHundredNotes(availableNotes);
                remainingAmount = remainingAmount - (availableNotes * 500); // Calculate actual remaining
            }
            // If availableNotes == 0, remainingAmount stays the same
        }

        // Pass the remaining amount to the next handler
        if (remainingAmount > 0) {
            super.withDraw(atm, remainingAmount);
        }
    }

}
