package LLD.VendingMachineLLD.StateDetails.impl;

import LLD.VendingMachineLLD.*;
import LLD.VendingMachineLLD.StateDetails.*;

import java.util.*;

public class DispatchState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new IllegalStateException("You cannot perform this action now");
    }

    @Override
    public void insetCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception {
        throw new IllegalStateException("You cannot perform this action now");
    }

    @Override
    public void clickOnChooseProductButton(VendingMachine vendingMachine) throws Exception {
        throw new IllegalStateException("You cannot perform this action now");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new IllegalStateException("You cannot perform this action now");
    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        throw new IllegalStateException("You cannot perform this action now");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setState(new IdleState());
        return item;
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        throw new IllegalStateException("You cannot perform this action now");
    }
}
