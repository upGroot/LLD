package LLD.SplitwiseLLD.BalanceSheet;

import LLD.SplitwiseLLD.Split.*;
import LLD.SplitwiseLLD.User.*;

import java.util.*;

public class ExpenseBalanceSheetController {
    public void updateUserBalanceSheet(List<Split> splitDetails, User paidByUser, double expenseAmount) {
        UserExpenseBalanceSheet paidByUserBalanceSheet = paidByUser.getUserExpenseBalanceSheet();
        paidByUserBalanceSheet.setTotalPayment(paidByUserBalanceSheet.getTotalPayment() + expenseAmount);
        for (Split split : splitDetails) {
            User owedUser = split.getUser();
            UserExpenseBalanceSheet owedUserBalanceSheet = owedUser.getUserExpenseBalanceSheet();
            double amountOwe = split.getAmount();
            if (owedUser.getUserId().equals(paidByUser.getUserId()))
                owedUserBalanceSheet.setTotalExpense(owedUserBalanceSheet.getTotalExpense() + amountOwe);
            else {
                //update get amount of paid user..
                paidByUserBalanceSheet.setTotalGetBack(paidByUserBalanceSheet.getTotalGetBack() + amountOwe);
                owedUserBalanceSheet.setTotalOwe(owedUserBalanceSheet.getTotalOwe() + amountOwe);
                Balance userOweBalance;
                if(paidByUserBalanceSheet.userFriendBalance.containsKey(owedUser)) {
                    userOweBalance = paidByUserBalanceSheet.userFriendBalance.get(owedUser);
                }
                else {
                    userOweBalance = new Balance();
                    paidByUserBalanceSheet.userFriendBalance.put(owedUser.getUserId(), userOweBalance);
                }
                userOweBalance.setTotalGetBack(userOweBalance.getTotalGetBack() + amountOwe);
                Balance userPaidBalance;
                if (owedUserBalanceSheet.userFriendBalance.containsKey(paidByUser.getUserId())) {
                    userPaidBalance = owedUserBalanceSheet.userFriendBalance.get(paidByUser.getUserId());
                }
                else {
                    userPaidBalance = new Balance();
                    owedUserBalanceSheet.userFriendBalance.put(paidByUser.getUserId(), userPaidBalance);
                }
                userPaidBalance.setTotalOwe(userPaidBalance.getTotalOwe() + amountOwe);
            }
        }
    }
    public void showBalanceSheetOfUser(User user){

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet =  user.getUserExpenseBalanceSheet();

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalOwe());
        System.out.println("TotalPaymnetMade: " + userExpenseBalanceSheet.getTotalPayment());
        for(Map.Entry<String, Balance> entry : userExpenseBalanceSheet.userFriendBalance.entrySet()){

            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getTotalGetBack() + " YouOwe:" + balance.getTotalOwe());
        }

        System.out.println("---------------------------------------");

    }

    // Business Logic
}
