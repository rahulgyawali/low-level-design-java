package practice.observer;

import java.util.*;

public class Observable implements IObservable{

    List<IObserver> observerList;
    int stock = 0;

    public Observable(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observerList.remove(observer);
    }

     @Override
    public void notifyObserver(){
        for(IObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setData(int newStock){
        this.stock = this.stock + newStock;
        notifyObserver();
    }

    @Override
    public int getData(){
        return stock;
    }
}
