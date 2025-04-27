package headfirstdesignpatterns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();    //Observable
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);    //Observer
        Observer forecastConditionDisplay = new ForecastConditionDisplay(weatherData);  //Observer
        weatherData.setData(10,20,30);
        weatherData.setData(100,200,300);
        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setData(1000,2000,3000);

    }
}
