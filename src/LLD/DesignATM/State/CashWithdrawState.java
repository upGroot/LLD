package LLD.DesignATM.State;

import LLD.DesignATM.*;
import LLD.DesignATM.WithdrawProcessor.*;

public class CashWithdrawState extends AtmState{
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
        if(atm.getAtmBalance() < withdrawAmount) {
            System.out.println("ATM does not have sufficient money");
        }
        else if(card.getBankBalance() < withdrawAmount){
            System.out.println("Insufficient account balance");
        }
        else {
            CashWithdrawProcessor cashProcess = new TwoThousandNoteProcessor(
                    new FiveHundredNoteProcessor(
                            new OneHundredNoteProcessor(null)));
            int remainingAmount = cashProcess.getAmount(atm, withdrawAmount);
            if (remainingAmount != 0) {
                System.out.println("Please enter amount in multiples of 100");
            }
            else
                atm.deductATMBalance(withdrawAmount);
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
}
