package practice.chainofresponsbility.atm;

public class IdleState extends State{

    public void insertCard(ATMMachine atmMachine,ATMCard card) throws Exception{
        atmMachine.setState(new HasCardState());
    }

}
