package designpatterns.behavioral.observer.without;

public interface ObservableInterface {

    /*List<ObserverInterface> objList*/

    public void add(/*ObserverInterface*/);                              //Registration
    public void remove(/*ObserverInterface*/);
    public void notifyObserver(/*objList*/);
    public void setData();
}
