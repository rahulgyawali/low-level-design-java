package practice.observer;

public class PhoneObserver implements IObserver{
    String phone;
    IObservable observable;
    public PhoneObserver(String phone, IObservable observable){
        this.observable = observable;
        this.observable.add(this);
        this.phone = phone;
    }

    @Override
    public void update() {
        sendSMS(this.phone,observable.getData());
    }

    public void sendSMS(String phone,int currentStock){
        System.out.println("Stock updated to "+currentStock+" Sending SMS to "+phone);
    }
}
