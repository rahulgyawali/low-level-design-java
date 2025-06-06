package practice.chainofresponsbility.atm.withdrawal;

import practice.chainofresponsbility.atm.ATMMachine;

public abstract class CashWithdrawProcess {

    CashWithdrawProcess cashWithdrawProcess;

    public CashWithdrawProcess(CashWithdrawProcess cashWithdrawProcess){
        this.cashWithdrawProcess = cashWithdrawProcess;
    }

    public void withdraw(ATMMachine atmMachine,int amount){
        if(cashWithdrawProcess != null){
            cashWithdrawProcess.withdraw(atmMachine,amount);
        }
    }
}
