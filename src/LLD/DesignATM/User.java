package LLD.DesignATM;

public class User {
    Card card;
    BankAccount bankAccount;
    public User(Card card, BankAccount bankAccount) {
        this.card = card;
        this.bankAccount = bankAccount;
    }
}
