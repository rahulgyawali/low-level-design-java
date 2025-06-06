package practice.chainofresponsbility.atm.withdrawal;

import practice.chainofresponsbility.atm.ATMMachine;

public class ThousandWithdrawProcess extends CashWithdrawProcess{
    public ThousandWithdrawProcess(CashWithdrawProcess cashWithdrawProcess){
       super(cashWithdrawProcess);
    }
    @Override
    public void withdraw(ATMMachine atmMachine, int amount) {
        int bills = amount/1000;
        int remaining = amount%1000;
        if(bills != 0 && bills <= atmMachine.getCounts(1000)){
            atmMachine.deductThousand(bills);
        }else if(bills > atmMachine.getCounts(1000)){
            atmMachine.deductHundred(atmMachine.getCounts(100));
            remaining = remaining + (bills - atmMachine.getCounts(100))*100;
        }
        if(remaining != 0){
            super.withdraw(atmMachine,remaining);
        }
    }
}
