package practice.state.vendinmachine;

public class DispenseProductState extends State{

    public DispenseProductState(VendingMachine vendingMachine,int id) throws Exception{
        System.out.println("Vending machine in "+this.getClass().getSimpleName()+" state ");
        Item item = dispenseProduct(vendingMachine,id);
    }

    public Item dispenseProduct(VendingMachine vendingMachine,int id) throws Exception{
        ItemManager itemManager = ItemManager.getItemManager();
        vendingMachine.setState(new IdleState());
        return itemManager.removeItem(id);
    }
}
