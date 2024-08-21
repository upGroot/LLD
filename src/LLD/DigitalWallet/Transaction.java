package LLD.DigitalWallet;

public class Transaction {
    private String id;
    private double amount;
    User transferredBy;
    User transferredTo;
    PaymentMethod paymentMethod;

    public Transaction(String id, double amount, User transferredBy, User transferredTo, PaymentMethod paymentMethod) {
        this.id = id;
        this.amount = amount;
        this.transferredBy = transferredBy;
        this.transferredTo = transferredTo;
        this.paymentMethod = paymentMethod;
    }
}
