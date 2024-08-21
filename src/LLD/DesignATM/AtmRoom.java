package LLD.DesignATM;

import LLD.DesignATM.State.*;

public class AtmRoom {
    ATM atm;
    User user;

    public static void main(String[] args) {

        AtmRoom atmRoom = new AtmRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.getAtmState().authenticatePin(atmRoom.atm, atmRoom.user.card, "4211");
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getAtmState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2750);
        atmRoom.atm.printCurrentATMStatus();


    }

    private void initialize() {

        //create ATM
        atm = new ATM(new IdleState());
        atm.setAtmBalance(3500, 1,2,5);

        //create User
        this.user = createUser();
    }

    private User createUser(){
        Card card = createCard();
        User user = new User(card, createBankAccount());
        return user;
    }

    private Card createCard(){

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private BankAccount createBankAccount() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountBalance(3000.0);
        return bankAccount;

    }

}
