package LLD.SplitwiseLLD.Split;

import java.util.*;

public class EqualSplit implements ExpenseSplit{
    @Override
    public void validateExpense(List<Split> splits, double totalAmount) throws Exception {
        double totalAmountEach = totalAmount/splits.size();
        for(Split split : splits) {
            if (split.amount !=totalAmountEach)
                throw new Exception("Amount Split Discrepancy");
        }
    }
}
