package headfirstdesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
           observers.get(i).update(temperature,humidity,pressure);
        }
    }

    public void DataChanged(){
        notifyObservers();
    }

    public void setData(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        DataChanged();
    }
}
