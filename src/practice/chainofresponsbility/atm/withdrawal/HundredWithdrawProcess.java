package practice.chainofresponsbility.atm.withdrawal;

import practice.chainofresponsbility.atm.ATMMachine;

public class HundredWithdrawProcess extends CashWithdrawProcess{
    public HundredWithdrawProcess(CashWithdrawProcess cashWithdrawProcess){
        super(cashWithdrawProcess);
    }
    @Override
    public void withdraw(ATMMachine atmMachine, int amount) {
        int bills = amount/100;
        int remaining = amount%100;
        if(bills <= atmMachine.getCounts(100)){
            atmMachine.deductThousand(bills);
        }else if(bills > atmMachine.getCounts(100)){
            atmMachine.deductHundred(atmMachine.getCounts(10));
            remaining = remaining + (bills - atmMachine.getCounts(10))*10;
        }
        if(remaining != 0){
            super.withdraw(atmMachine,remaining);
        }
    }
}
