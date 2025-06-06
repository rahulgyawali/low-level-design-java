package practice.chainofresponsbility.atm;

public abstract class State {
    public void insertCard(ATMMachine atmMachine,ATMCard card) throws Exception {throw new Exception("Cannot perform this operation");}
    public void authenticateCard(ATMMachine atmMachine, ATMCard atmCard, int pin) throws Exception {throw new Exception("Cannot perform this operation");}
    public void selectOperation(ATMMachine atmMachine,ATMCard atmCard,Transaction transaction) throws Exception {throw new Exception("Cannot perform this operation");}
    public void withDrawCash(ATMMachine atmMachine, ATMCard atmCard, int drawCash) throws Exception {throw new Exception("Cannot perform this operation");}
    public void displayBalance(ATMMachine atmMachine,ATMCard atmCard) throws Exception {throw new Exception("Cannot perform this operation");}
    public void exit(ATMMachine atmMachine) throws Exception {throw new Exception("Cannot perform this operation");}
}
