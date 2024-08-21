package LLD.DesignATM;

public class BankAccount {
    private double accountBalance;
    private String accNumber;
    private String accHolderName;

//    public BankAccount(String accNumber, String accHolderName) {
//        this.accNumber = accNumber;
//        this.accHolderName = accHolderName;
//    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void updateBalance(double withdrawAmount) {
        setAccountBalance(accountBalance - withdrawAmount);
    }
}
