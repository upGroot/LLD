package LLD.DesignATM.WithdrawProcessor;

import LLD.DesignATM.*;

public class TwoThousandNoteProcessor extends CashWithdrawProcessor{
    public TwoThousandNoteProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }
    @Override
    public int getAmount(ATM atm, int balanceAmount) {
        int currNoOfNotes = atm.getNoOfTwoThousandNotes();
        int requiredNoOfNotes = balanceAmount/2000;
        if(requiredNoOfNotes > currNoOfNotes) {
            balanceAmount -= currNoOfNotes * 2000;
            atm.deductTwoThousandNotes(currNoOfNotes);
        }
        else {
            balanceAmount -= requiredNoOfNotes * 2000;
            currNoOfNotes -= requiredNoOfNotes;
            atm.deductTwoThousandNotes(currNoOfNotes);
        }
        if (balanceAmount != 0)
            super.getAmount(atm, balanceAmount);
        return balanceAmount;
    }
}
