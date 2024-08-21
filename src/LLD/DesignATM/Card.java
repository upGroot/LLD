package LLD.DesignATM;

public class Card {
    private String cvv;
    private String cardNumber;
    private String expiryDate;
    private static String pin = "4211";
    BankAccount bankAccount;

//    public Card(String cvv, String cardNumber, String expiryDate) {
//        this.cvv = cvv;
//        this.cardNumber = cardNumber;
//        this.expiryDate = expiryDate;
//    }
    public boolean validatePin(String enteredPin) {
        if(pin.equalsIgnoreCase(enteredPin))
            return true;
        return false;
    }
    public double getBankBalance() {
        return bankAccount.getAccountBalance();
    }
    public void deductBalance(int withdrawAmount) {
        bankAccount.updateBalance(withdrawAmount);
    }
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
