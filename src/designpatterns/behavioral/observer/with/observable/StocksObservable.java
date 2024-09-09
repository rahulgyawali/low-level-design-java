package designpatterns.behavioral.observer.with.observable;

import designpatterns.behavioral.observer.with.observer.NotificationObserver;

public interface StocksObservable {

    public void add(NotificationObserver observer);         //Add item

    public void remove(NotificationObserver observer);      //Remove item

    public void notifyObserver();                           //Notify who are still observing

    public void setData(int newStock);                      //Add in the data to the data structure used

    public int getData();                                   //Remove in the data structure used
}
