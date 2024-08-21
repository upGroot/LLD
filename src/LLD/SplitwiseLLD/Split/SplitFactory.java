package LLD.SplitwiseLLD.Split;

public class SplitFactory {
    public static ExpenseSplit getSplitObj(SplitType splitType) {
        switch (splitType) {
            case EQUAL:
                return new EqualSplit();
            case UNEQUAL:
                return new UnEvenSplit();
            default:
                return null;
        }
    }
}
