package practice.state.vendinmachine;

public interface State {
    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void selectChooseProductButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoinAction(VendingMachine vendingMachine,Coin coin) throws Exception;
    public void chooseProductAction(VendingMachine vendingMachine,int id) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine,int id) throws Exception;

}
