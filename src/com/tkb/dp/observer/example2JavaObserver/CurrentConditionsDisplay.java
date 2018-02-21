package com.tkb.dp.observer.example2JavaObserver;
import com.tkb.dp.observer.example1.interfaces.DisplayElement;

import java.util.Observable;
// This is concrete observer

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {

    float temperature, humidity,pressure;

    Observable observable;
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            humidity = weatherData.humidity;
            temperature = weatherData.temperature;
            pressure = weatherData.pressure;
            display();
        }
    }
}
