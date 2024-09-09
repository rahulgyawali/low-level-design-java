package designpatterns.behavioral.observer.with.observable;

import designpatterns.behavioral.observer.with.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    public List<NotificationObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(NotificationObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setData(int newStockAdded){
        if(stockCount == 0){
            notifyObserver();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getData(){
        return stockCount;
    }
}
