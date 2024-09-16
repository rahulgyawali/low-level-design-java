package designpatterns.behavioral.state.vendingmachine.states;

import designpatterns.behavioral.state.vendingmachine.Coin;
import designpatterns.behavioral.state.vendingmachine.Item;
import designpatterns.behavioral.state.vendingmachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        vendingMachine.getCoins().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

}
