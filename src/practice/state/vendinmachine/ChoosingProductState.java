package practice.state.vendinmachine;

public class ChoosingProductState implements State{
    public ChoosingProductState(){
        System.out.println("Vending machine in "+this.getClass().getSimpleName()+" state ");
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
        //Choose Product
        Item item = vendingMachine.getItemManager().removeItem(id);
        int total = 0;
        for(Coin coin: vendingMachine.getCoinList()){
            total = total + coin.getValue();
        }
        if(total >= item.getPrice()){
            vendingMachine.getItemManager().addItem(id,item);
            vendingMachine.setState(new DispenseProductState(vendingMachine,id));
        }else{
            vendingMachine.getItemManager().addItem(id,item);
            System.out.println("Cannot buy");
        }
    }
    public Item dispenseProduct(VendingMachine vendingMachine,int id) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
}
