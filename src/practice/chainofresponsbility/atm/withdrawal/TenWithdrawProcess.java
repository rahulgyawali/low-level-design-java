package practice.chainofresponsbility.atm.withdrawal;

import practice.chainofresponsbility.atm.ATMMachine;
import practice.chainofresponsbility.atm.State;

public class TenWithdrawProcess extends CashWithdrawProcess{
    public TenWithdrawProcess(CashWithdrawProcess cashWithdrawProcess){
        super(cashWithdrawProcess);
    }

    @Override
    public void withdraw(ATMMachine atmMachine, int amount) {
        int bills = amount/10;
        int remaining = amount%10;
        if(bills <= atmMachine.getCounts(10)){
            atmMachine.deductThousand(bills);
        }
        if(remaining != 0){
            System.out.println("Low balance in Machine");
        }
    }
}
