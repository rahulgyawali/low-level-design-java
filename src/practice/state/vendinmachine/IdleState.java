package practice.state.vendinmachine;

public class IdleState extends State{

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

}
