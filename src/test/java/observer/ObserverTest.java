package observer;

import patterns.observer.CurrentConditionsDisplay;
import patterns.observer.WeatherData;

public class ObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionsDisplay(weatherData));
        weatherData.measurementsChanged(32.0F, 16.0F, 17F);
    }
}
