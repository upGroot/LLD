package LLD.DigitalWallet;

import java.util.*;

public class Account {
    String accountNumber;
    String accountHolderId;
    String bankName;
    double balance;
    AccountStatus status;
    Currency currency;
    List<Transaction> transactionList;

    public Account(String accountNumber, String accountHolderId, String bankName, Currency currency) {
        this.accountNumber = accountNumber;
        this.accountHolderId = accountHolderId;
        this.bankName = bankName;
        this.balance = 0;
        this.status = AccountStatus.ACTIVE;
        this.currency = currency;
        transactionList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InSufficientFundException("Insufficient funds in the account.");
        }
    }
}
