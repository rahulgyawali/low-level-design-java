package practice.state.vendinmachine;

public abstract class State {
    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception{throw new Exception("Cannot perform this operation");};
    public void selectChooseProductButton(VendingMachine vendingMachine) throws Exception{throw new Exception("Cannot perform this operation");};
    public void insertCoinAction(VendingMachine vendingMachine,Coin coin) throws Exception{throw new Exception("Cannot perform this operation");};
    public void chooseProductAction(VendingMachine vendingMachine,int id) throws Exception{throw new Exception("Cannot perform this operation");};
    public Item dispenseProduct(VendingMachine vendingMachine,int id) throws Exception{throw new Exception("Cannot perform this operation");}

}
