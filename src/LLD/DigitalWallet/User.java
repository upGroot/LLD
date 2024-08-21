package LLD.DigitalWallet;

import java.util.*;

public class User {
    private String name;
    private String id;
    private String mobile;
    List<Account> userAccountList;
    List<Transaction> userTransactionList;
    List<PaymentMethod> paymentMethods;
    public User(String name, String id, String mobile) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
        userAccountList = new ArrayList<>();
        userTransactionList = new ArrayList<>();
        paymentMethods = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMobile() {
        return mobile;
    }

    public List<Account> getUserAccountList() {
        return userAccountList;
    }

    public List<Transaction> getUserTransactionList() {
        return userTransactionList;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void addTransaction(Transaction transaction) {
        userTransactionList.add(transaction);
    }
    public void addAccount(Account account) {
        userAccountList.add(account);
    }
    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }
    public void removePaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.remove(paymentMethod);
    }
}
