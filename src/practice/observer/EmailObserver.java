package practice.observer;

public class EmailObserver implements IObserver{
    String email;
    IObservable observable;
    public EmailObserver(String email,IObservable observable){
        this.observable = observable;
        this.observable.add(this);
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(this.email,observable.getData());
    }

    public void sendEmail(String email,int currentStock){
        System.out.println("Stock updated to "+currentStock+" Sending email to "+email);
    }
}
