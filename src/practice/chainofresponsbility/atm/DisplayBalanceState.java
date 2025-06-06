package practice.chainofresponsbility.atm;

public class DisplayBalanceState extends State{
    @Override
    public void displayBalance(ATMMachine atmMachine, ATMCard atmCard) throws Exception {
        atmMachine.setState(new IdleState());
    }
}
