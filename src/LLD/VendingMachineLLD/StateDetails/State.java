package LLD.VendingMachineLLD.StateDetails;

import LLD.VendingMachineLLD.*;

import java.util.*;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void insetCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception;
    public void clickOnChooseProductButton(VendingMachine vendingMachine) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;
    public int getChange(int extraMoney) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception;
}
