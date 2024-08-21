package LLD.SplitwiseLLD.BalanceSheet;

import java.util.*;

public class UserExpenseBalanceSheet {
    Map<String, Balance> userFriendBalance;
    private double totalOwe;
    private double totalExpense;
    private double totalGetBack;
    private double totalPayment;

    public UserExpenseBalanceSheet() {
        userFriendBalance = new HashMap<String, Balance>();
        totalExpense = 0;
        totalOwe = 0;
        totalGetBack = 0;
        totalPayment = 0;
    }
    public double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
