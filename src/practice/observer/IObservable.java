package practice.observer;

public interface IObservable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObserver();
    public int getData();
    public void setData(int data);
}
