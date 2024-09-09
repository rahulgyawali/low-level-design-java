package designpatterns.behavioral.template.with;

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void calculatePlatformFee();
    public abstract void debitAmount();
    public abstract void creditAmount();

    //This provides the order of execution of the task
    public final void sendMoney(){
        //step 1
        validateRequest();
        //step 2
        debitAmount();
        //step 3
        calculatePlatformFee();
        //step 4
        creditAmount();
    }

}
