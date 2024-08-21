package LLD.SplitwiseLLD.User;

import LLD.SplitwiseLLD.BalanceSheet.*;

public class User {
    private String userId;
    private String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;
    public User(String id, String userName){
        this.userId = id;
        this.userName = userName;
        userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }
    public String getUserId() {
        return userId;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

}
