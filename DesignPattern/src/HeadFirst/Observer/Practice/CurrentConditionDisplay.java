package HeadFirst.Observer.Practice;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }


}
//public class CurrentConditionDisplay implements Observer, DisplayElement {
//    private float temperature;
//    private float humidity;
//    Subject weatherData;
//
//
//    public CurrentConditionDisplay(Subject weatherData) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }
//
//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }
//
//    @Override
//    public void display() {
//        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
//    }
//
//
//}
