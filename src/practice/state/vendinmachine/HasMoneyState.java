package practice.state.vendinmachine;

public class HasMoneyState implements State{
    public HasMoneyState(){
        System.out.println("Vending machine in "+this.getClass().getSimpleName()+" state ");
    }

    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    public void selectChooseProductButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setState(new ChoosingProductState());
    }
    public void insertCoinAction(VendingMachine vendingMachine,Coin coin) throws Exception{
        //Insert money
        vendingMachine.getCoinList().add(coin);
    }
    public void chooseProductAction(VendingMachine vendingMachine,int id) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
    public Item dispenseProduct(VendingMachine vendingMachine,int id) throws Exception{
        throw new Exception("Cannot perform this operation");
    }
}
