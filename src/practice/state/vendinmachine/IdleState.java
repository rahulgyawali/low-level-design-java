package practice.state.vendinmachine;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Vending machine in "+this.getClass().getSimpleName()+" state ");
    }

    public IdleState(VendingMachine vendingMachine) throws Exception {
        System.out.println("Vending machine in "+this.getClass().getSimpleName()+" state ");
        selectInsertCoinButton(vendingMachine);
    }

    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        //Can only select this
        vendingMachine.setState(new HasMoneyState());
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
        throw new Exception("Cannot perform this operation");
    }

}
