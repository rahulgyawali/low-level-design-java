package practice.state.vendinmachine;

public class DispenseProductState implements State{
    public DispenseProductState(VendingMachine vendingMachine,int id) throws Exception{
        System.out.println("Vending machine in "+this.getClass().getSimpleName()+" state ");
        dispenseProduct(vendingMachine,id);
    }

    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    public void selectChooseProductButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    public void insertCoinAction(VendingMachine vendingMachine,Coin coin) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    public void chooseProductAction(VendingMachine vendingMachine,int id) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    public Item dispenseProduct(VendingMachine vendingMachine,int id) throws Exception{
        ItemManager itemManager = ItemManager.getItemManager();
        vendingMachine.setState(new IdleState());
        return itemManager.removeItem(id);
    }
}
