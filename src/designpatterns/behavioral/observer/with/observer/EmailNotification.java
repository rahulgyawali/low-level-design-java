package designpatterns.behavioral.observer.with.observer;

import designpatterns.behavioral.observer.with.observable.StocksObservable;

public class EmailNotification implements NotificationObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailNotification(String emailId,StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(){
        sendEmail(emailId,"Product is back again");
    }

    private void sendEmail(String emailId,String Message){
        System.out.println("Here is the message on Email!!!");
    }
}
