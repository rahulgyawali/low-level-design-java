package practice.state.vendinmachine;

import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getItemManager().fill(vendingMachine);
        vendingMachine.getItemManager().displayInventory(vendingMachine);

        State state = vendingMachine.getState();
        state.selectInsertCoinButton(vendingMachine);

        state = vendingMachine.getState();
        state.insertCoinAction(vendingMachine,new Coin(1));
        state.insertCoinAction(vendingMachine,new Coin(1));
        state.insertCoinAction(vendingMachine,new Coin(1));
        state.selectChooseProductButton(vendingMachine);

        state = vendingMachine.getState();
        state.chooseProductAction(vendingMachine,2);

        vendingMachine.getItemManager().displayInventory(vendingMachine);

    }


}
