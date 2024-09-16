package designpatterns.behavioral.state.vendingmachine.states;

import designpatterns.behavioral.state.vendingmachine.Coin;
import designpatterns.behavioral.state.vendingmachine.Item;
import designpatterns.behavioral.state.vendingmachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    IdleState(){
        System.out.println("In Idle State");
    }

    IdleState(VendingMachine vendingMachine){
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot Perform this Operation");
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
