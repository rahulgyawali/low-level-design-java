package practice.chainofresponsbility.atm;

public class SelectOperationState extends State{
    @Override
    public void selectOperation(ATMMachine atmMachine, ATMCard atmCard, Transaction transaction) throws Exception {
        if(transaction.name().equals(Transaction.DISPLAY.name())){
            atmMachine.setState(new DisplayBalanceState());
        }else if(transaction.name().equals(Transaction.WITHDRAW.name())){
            atmMachine.setState(new WithDrawBalanceState());
        }else {
            System.out.println("Invalid Operation State");
        }
    }
}
