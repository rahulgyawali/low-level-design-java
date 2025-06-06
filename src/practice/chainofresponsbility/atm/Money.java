package practice.chainofresponsbility.atm;

public abstract class Money {
    int value;
    int count;
    Money money;

    Money(Money money){
        this.money = money;
    }

    public void exchange(int value){
        if(money != null){
            if(value == 0) return;
            int currentBills = value/this.value;
            this.count = this.count -1;
            money.exchange(value%this.value);
        }
    }
}
