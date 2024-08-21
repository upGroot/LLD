package LLD.SplitwiseLLD.Expense;

import LLD.SplitwiseLLD.Split.*;
import LLD.SplitwiseLLD.User.*;

import java.util.*;

public class Expense {
    private String expenseId;
    private String description;
    private double expenseAmount;
    User paidByUser;
    SplitType splitType;
    List<Split> splits;
    public Expense(String expenseId, double expenseAmount, String description,
                   User paidByUser, SplitType splitType, List<Split> splitDetails) {
        splits = new ArrayList<>();
        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.description = description;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splits.addAll(splitDetails);

    }

}
