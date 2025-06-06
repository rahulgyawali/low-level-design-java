package practice.chainofresponsbility.atm;

public class HasCardState extends State{

    public void authenticateCard(ATMMachine atmMachine, ATMCard atmCard, int pin) throws Exception {
        if(atmCard.pin == pin){
            atmMachine.setState(new SelectOperationState());
        }else {
            System.out.println("Incorrect PIN");
        }
    }
}
