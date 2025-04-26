package headfirstdesignpatterns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastConditionDisplay forecastConditionDisplay = new ForecastConditionDisplay(weatherData);
        weatherData.setData(10,20,30);
        weatherData.setData(100,200,300);
        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setData(1000,2000,3000);

    }
}
