package q_17_atm_design.AmountWithdrawl;

import q_17_atm_design.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor{
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withDraw(ATM atm, int remainingAmount) {
        int required = remainingAmount / 2000;
        int availableNotes = atm.getNoOfTwoThousandNotes();

        if (required > 0) {
            if (required <= availableNotes) {
                // Can dispense all required 2000 notes
                atm.deductTwoThousandNotes(required);
                remainingAmount = remainingAmount % 2000; // Only remainder left
            } else if (availableNotes > 0) {
                // Can only dispense some 2000 notes
                atm.deductTwoThousandNotes(availableNotes);
                remainingAmount = remainingAmount - (availableNotes * 2000); // Calculate actual remaining
            }
            // If availableNotes == 0, remainingAmount stays the same
        }

        // Pass the remaining amount to the next handler
        if (remainingAmount > 0) {
            super.withDraw(atm, remainingAmount);
        }
    }
}
