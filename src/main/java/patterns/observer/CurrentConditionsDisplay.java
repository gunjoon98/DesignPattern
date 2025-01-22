package patterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("current state : 온도 " + temperature + "F, 습도 " +
                humidity + "%");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}