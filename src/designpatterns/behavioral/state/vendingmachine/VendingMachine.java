package designpatterns.behavioral.state.vendingmachine;

import designpatterns.behavioral.state.vendingmachine.states.State;

import java.util.List;

public class VendingMachine {
    Inventory inventory;
    List<Coin> coins;
    State state;

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
