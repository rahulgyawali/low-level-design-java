package practice.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        IObservable stockObservable = new Observable();
        IObserver email = new EmailObserver("xyz@gmail",stockObservable);
        IObserver phone = new PhoneObserver("12323432",stockObservable);
        stockObservable.setData(2);
    }
}
