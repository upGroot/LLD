package LLD.VendingMachineLLD.StateDetails.impl;

import LLD.VendingMachineLLD.*;
import LLD.VendingMachineLLD.StateDetails.*;

import java.util.*;

public class IdleState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void insetCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception {
        throw new IllegalStateException("First click on insert coin button");
    }

    @Override
    public void clickOnChooseProductButton(VendingMachine vendingMachine) throws Exception {
        throw new IllegalStateException("First click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new IllegalStateException("First click on insert coin button");
    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        throw new IllegalStateException("First click on insert coin button");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new IllegalStateException("First click on insert coin button");
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        throw new IllegalStateException("First click on insert coin button");
    }
}
