package LLD.DesignATM.State;

import LLD.DesignATM.*;

public class SelectOperationState extends AtmState{

    public SelectOperationState() {
        showAllOperations();
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        switch (txnType){
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdrawState());
                break;
            case BALANCE_CHECK:
                atm.setAtmState(new BalanceEnquiryState());
                break;
            default:
                System.out.println("Transaction Not available");
                exit(atm);
        }
    }
    public void returnCard(){
        System.out.println("Please collect your card");
    }

    public void exit(ATM atm){
        returnCard();
        atm.setAtmState(new IdleState());
    }

    public void showAllOperations() {
        TransactionType.showAllTransactionTypes();
    }
}
