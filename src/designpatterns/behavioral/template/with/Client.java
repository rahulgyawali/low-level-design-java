package designpatterns.behavioral.template.with;

public class Client {

    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.sendMoney();
        System.out.println("#############");
        PaymentFlow paymentFlow1 = new PayToMerchant();
        paymentFlow1.sendMoney();
    }
}
