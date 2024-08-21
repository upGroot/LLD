package LLD.DesignATM.WithdrawProcessor;

import LLD.DesignATM.*;

public abstract class CashWithdrawProcessor {
    CashWithdrawProcessor cashWithdrawProcessor;
    public CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        this.cashWithdrawProcessor = cashWithdrawProcessor;
    }
    public int getAmount(ATM atm, int balanceAmount) {
        int remainingAmount = 0;
        if (cashWithdrawProcessor != null) {
            cashWithdrawProcessor.getAmount(atm, balanceAmount);
        }
        else {
            remainingAmount =  balanceAmount;
        }
        return remainingAmount;
    }
}
