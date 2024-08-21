package LLD.SplitwiseLLD.Split;

import java.util.*;

public interface ExpenseSplit {
    void validateExpense(List<Split> splitList, double totalAmount) throws Exception;
}
