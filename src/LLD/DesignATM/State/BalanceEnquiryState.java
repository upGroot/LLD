package LLD.DesignATM.State;

import LLD.DesignATM.*;

public class BalanceEnquiryState extends AtmState{

    public void displayBalance(ATM atm, Card card){
        System.out.println("Your current bank balance is : " + card.getBankBalance());
    }
    public void returnCard(){
        System.out.println("Please collect your card");
    }

    public void exit(ATM atm){
        returnCard();
        atm.setAtmState(new IdleState());
    }
}
