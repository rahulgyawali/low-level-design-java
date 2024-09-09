package designpatterns.behavioral.observer.with.observer;

import designpatterns.behavioral.observer.with.observable.StocksObservable;

public class MobileNotification implements NotificationObserver{

    String mobile;
    StocksObservable stocksObservable;

    public MobileNotification(String mobile,StocksObservable stocksObservable){
        this.mobile = mobile;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(){
        sendSMS(mobile,"Product is back again");
    }

    private void sendSMS(String mobile,String message){
        System.out.println("Here is the message on SMS!!!");
    }

}
