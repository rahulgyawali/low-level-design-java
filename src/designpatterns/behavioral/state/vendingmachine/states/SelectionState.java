package designpatterns.behavioral.state.vendingmachine.states;

import designpatterns.behavioral.state.vendingmachine.Coin;
import designpatterns.behavioral.state.vendingmachine.Item;
import designpatterns.behavioral.state.vendingmachine.VendingMachine;

import java.util.List;

public class SelectionState implements State{

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception{
        Item item = vendingMachine.getInventory().getItemByCode(codeNumber);
        int paidByUser = 0;
        if(item != null){
            for(Coin coin: vendingMachine.getCoins()){
                paidByUser +=coin.value;
            }
            if(paidByUser < item.getPrice()){
                refundFullMoney(vendingMachine);
                throw new Exception("Insufficient Amount");
            }else if(paidByUser >= item.getPrice()){
                if(paidByUser > item.getPrice()){
                    getChange(paidByUser - item.getPrice());
                }
                vendingMachine.setState(new DispenseState(vendingMachine,codeNumber));
            }
        }else {
            throw new Exception("Item Unavailable");
        }
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setState(new IdleState());
        return vendingMachine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception{
        throw new Exception("Cannot Perform this Operation");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception{
        System.out.println("Extra money returned "+returnChangeMoney);
        return returnChangeMoney;
    }

}
