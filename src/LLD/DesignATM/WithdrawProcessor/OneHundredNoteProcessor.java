package LLD.DesignATM.WithdrawProcessor;

import LLD.DesignATM.*;

public class OneHundredNoteProcessor extends CashWithdrawProcessor{
    public OneHundredNoteProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }
    @Override
    public int getAmount(ATM atm, int balanceAmount) {
        int currNoOfNotes = atm.getNoOfOneHundredNotes();
        int requiredNoOfNotes = balanceAmount/100;
        if(requiredNoOfNotes > currNoOfNotes) {
            balanceAmount -= currNoOfNotes * 100;
            atm.deductOneHundredNotes(currNoOfNotes);
        }
        else {
            balanceAmount -= requiredNoOfNotes * 100;
            currNoOfNotes -= requiredNoOfNotes;
            atm.deductOneHundredNotes(currNoOfNotes);
        }
        if (balanceAmount != 0)
            super.getAmount(atm, balanceAmount);
        return balanceAmount;
    }
}
