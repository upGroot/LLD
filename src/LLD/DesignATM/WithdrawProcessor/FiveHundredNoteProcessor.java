package LLD.DesignATM.WithdrawProcessor;

import LLD.DesignATM.*;

public class FiveHundredNoteProcessor extends CashWithdrawProcessor{
    public FiveHundredNoteProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public int getAmount(ATM atm, int balanceAmount) {
        int currNoOfNotes = atm.getNoOfFiveHundredNotes();
        int requiredNoOfNotes = balanceAmount/500;
        if(requiredNoOfNotes > currNoOfNotes) {
            balanceAmount -= currNoOfNotes * 500;
            atm.deductFiveHundredNotes(currNoOfNotes);
        }
        else {
            balanceAmount -= requiredNoOfNotes * 500;
            currNoOfNotes -= requiredNoOfNotes;
            atm.deductFiveHundredNotes(currNoOfNotes);
        }
        if (balanceAmount != 0)
            super.getAmount(atm, balanceAmount);
        return balanceAmount;
    }
}
