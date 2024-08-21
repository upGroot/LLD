package LLD.VendingMachineLLD;

import LLD.VendingMachineLLD.StateDetails.*;

import java.util.*;

public class VendingMachine {
    private State state;
    private Inventory inventory;
    private List<Coin> coins;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
