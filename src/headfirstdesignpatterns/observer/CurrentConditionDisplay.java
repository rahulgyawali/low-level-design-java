package headfirstdesignpatterns.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("This is current Data from "+CurrentConditionDisplay.class.getSimpleName()+" " +temperature+" "+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
