package headfirstdesignpatterns.observer;

public class ForecastConditionDisplay implements DisplayElement,Observer{
    private float temperature;
    private float pressure;
    private float humidity;
    private Subject subject;

    public ForecastConditionDisplay(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("This is the future from "+ForecastConditionDisplay.class.getSimpleName()+" "+(temperature*10)+" "+(pressure*9)+" "+(humidity*5));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
