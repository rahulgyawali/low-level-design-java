package practice.state.vendinmachine;

public class HasMoneyState extends State{
    public HasMoneyState(){
        System.out.println("Vending machine in "+this.getClass().getSimpleName()+" state ");
    }
    public void selectChooseProductButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setState(new ChoosingProductState());
    }
    public void insertCoinAction(VendingMachine vendingMachine,Coin coin) throws Exception{
        //Insert money
        vendingMachine.getCoinList().add(coin);
    }

}
