package practice.chainofresponsbility.atm;

import practice.chainofresponsbility.atm.withdrawal.CashWithdrawProcess;
import practice.chainofresponsbility.atm.withdrawal.HundredWithdrawProcess;
import practice.chainofresponsbility.atm.withdrawal.TenWithdrawProcess;
import practice.chainofresponsbility.atm.withdrawal.ThousandWithdrawProcess;

public class WithDrawBalanceState extends State{
    @Override
    public void withDrawCash(ATMMachine atmMachine, ATMCard atmCard, int drawCash) throws Exception {
        if(atmCard.getBankAccount().getBalance() < drawCash){
            System.out.println("Not sufficient balance");
        }else if(atmMachine.total < drawCash){
            System.out.println("Not enough money in ATM machine");
        }else{
            CashWithdrawProcess cashWithdrawProcess = new ThousandWithdrawProcess(new HundredWithdrawProcess(new TenWithdrawProcess(null)));
            cashWithdrawProcess.withdraw(atmMachine,drawCash);
        }
        atmMachine.setState(new IdleState());
    }
}
