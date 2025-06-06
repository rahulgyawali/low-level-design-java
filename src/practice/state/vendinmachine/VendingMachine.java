package practice.state.vendinmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    ItemManager itemManager;
    List<Coin> coinList;
    VendingMachine(){
        state = new IdleState();
        itemManager = ItemManager.getItemManager();
        coinList = new ArrayList<>();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ItemManager getItemManager() {
        return itemManager;
    }

    public void setItemManager(ItemManager itemManager) {
        this.itemManager = itemManager;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
