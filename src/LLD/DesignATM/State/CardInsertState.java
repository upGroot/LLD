package LLD.DesignATM.State;

import LLD.DesignATM.*;

public class CardInsertState extends AtmState{
    public void authenticatePin(ATM atm, Card card, String pin){
        if (card.validatePin(pin)) {
            System.out.println("Pin Verified Successfully");
            atm.setAtmState(new SelectOperationState());
        }
        else{
            System.out.println("Invalid Pin");
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
