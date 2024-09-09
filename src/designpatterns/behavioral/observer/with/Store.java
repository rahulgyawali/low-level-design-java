package designpatterns.behavioral.observer.with;

import designpatterns.behavioral.observer.with.observable.IphoneObservableImpl;
import designpatterns.behavioral.observer.with.observable.StocksObservable;
import designpatterns.behavioral.observer.with.observer.EmailNotification;
import designpatterns.behavioral.observer.with.observer.MobileNotification;
import designpatterns.behavioral.observer.with.observer.NotificationObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationObserver observer1 = new EmailNotification("r@g.com",iphoneObservable);
        NotificationObserver observer2 = new EmailNotification("g@y.com",iphoneObservable);
        NotificationObserver observer3 = new MobileNotification("232342134",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setData(0);
    }
}
