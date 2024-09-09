package designpatterns.behavioral.template.with;

public class PayToFriend extends PaymentFlow{

    @Override
    public void validateRequest(){
        System.out.println("Validate Request for Paying to a Friend");
    }

    @Override
    public  void calculatePlatformFee(){
        System.out.println("Calculating Platform fee for Paying to a Friend");
    }

    @Override
    public  void debitAmount(){
        System.out.println("Calculating Debit Amount for Paying to a Friend");
    }

    @Override
    public  void creditAmount(){
        System.out.println("Calculating Credit Amount for Paying to a Friend");
    }
}
