package LLD.SplitwiseLLD.Expense;

import LLD.SplitwiseLLD.BalanceSheet.*;
import LLD.SplitwiseLLD.Split.*;
import LLD.SplitwiseLLD.User.*;

import java.util.*;

public class ExpenseController {
    List<Expense> expenseList;
    ExpenseBalanceSheetController expenseBalanceSheetController;
    public ExpenseController() {
        expenseList = new ArrayList<>();
        expenseBalanceSheetController = new ExpenseBalanceSheetController();
    }
    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, SplitType splitType, User paidByUser) {
        ExpenseSplit typeOfSplit = SplitFactory.getSplitObj(splitType);
        try {
            typeOfSplit.validateExpense(splitDetails, expenseAmount);
            Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);
            expenseList.add(expense);
            expenseBalanceSheetController.updateUserBalanceSheet(splitDetails, paidByUser, expenseAmount);
            return expense;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
