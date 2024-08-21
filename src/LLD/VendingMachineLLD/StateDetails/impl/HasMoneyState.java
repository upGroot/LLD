package LLD.VendingMachineLLD.StateDetails.impl;

import LLD.VendingMachineLLD.*;
import LLD.VendingMachineLLD.StateDetails.*;

import java.util.*;

public class HasMoneyState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insetCoins(VendingMachine vendingMachine, List<Coin> coins) throws Exception {
        vendingMachine.getCoins().addAll(coins);
        System.out.println("Accepted Coins");
    }

    @Override
    public void clickOnChooseProductButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new SelectProductState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new IllegalStateException("You cannot choose product now");
    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        throw new IllegalStateException("You cannot get change now");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        System.out.println("Making full refund to customer as the order is cancelled");
        List<Coin> coinsToRefund= vendingMachine.getCoins();
        vendingMachine.setState(new IdleState());
        return coinsToRefund;
    }
}
