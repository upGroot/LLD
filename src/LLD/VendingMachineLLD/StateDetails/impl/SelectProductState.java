package LLD.VendingMachineLLD.StateDetails.impl;

import LLD.VendingMachineLLD.*;
import LLD.VendingMachineLLD.StateDetails.*;

import java.util.*;

public class SelectProductState implements State {
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
        throw new IllegalStateException("Please select the product");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        Inventory inventory = vendingMachine.getInventory();
        for(ItemShelf items : inventory.itemShelves) {
            Item item = items.getItem();
            if (items.getItemCode() == codeNumber) {
                if (!items.isAvailable()) {
                    throw new Exception("Selected item is not available, please select other item");

                }
                int amountPaidByUser = 0;
                for(Coin coin : vendingMachine.getCoins()) {
                    amountPaidByUser += coin.value;
                }
                if(amountPaidByUser < item.getPrice()) {
                    System.out.println("Please insert " + (item.getPrice() - amountPaidByUser) + " more to avail the product");
                    vendingMachine.setState(new HasMoneyState());
                }
                else {
                    if(amountPaidByUser > item.getPrice()) {
                        getChange((int) (amountPaidByUser-item.getPrice()));
                    }
                    vendingMachine.setState(new DispatchState());
                }
            }
        }
    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        //actual logic should be to return COINs in the dispense tray, but for simplicity i am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + extraMoney);
        return extraMoney;

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new IllegalStateException("Cannot dispense product now");
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        System.out.println("Making full refund to customer as the order is cancelled");
        List<Coin> coinsToRefund= vendingMachine.getCoins();
        vendingMachine.setState(new IdleState());
        return coinsToRefund;
    }
}
