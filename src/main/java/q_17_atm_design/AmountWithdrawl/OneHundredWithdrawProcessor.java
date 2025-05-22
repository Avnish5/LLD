package q_17_atm_design.AmountWithdrawl;

import q_17_atm_design.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{

    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withDraw(ATM atm, int remainingAmount) {

        int required = remainingAmount / 100;
        int availableNotes = atm.getNoOfOneHundredNotes();

        if (required > 0) {
            if (required <= availableNotes) {
                // Can dispense all required 100 notes
                atm.deductOneHundredNotes(required);
                remainingAmount = remainingAmount % 100; // Only remainder left
            } else if (availableNotes > 0) {
                // Can only dispense some 100 notes
                atm.deductOneHundredNotes(availableNotes);
                remainingAmount = remainingAmount - (availableNotes * 100); // Calculate actual remaining
            }
            // If availableNotes == 0, remainingAmount stays the same
        }

        // Check if any amount is left that cannot be dispensed
        if (remainingAmount > 0) {
            System.out.println("Cannot dispense remaining amount: " + remainingAmount);
            System.out.println("Transaction failed - insufficient denomination notes");
        }
    }
}
