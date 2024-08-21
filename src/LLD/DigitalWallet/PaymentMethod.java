package LLD.DigitalWallet;

public interface PaymentMethod {
    boolean makePayment(Account paidByAccount, Account paidToAccount);
}
