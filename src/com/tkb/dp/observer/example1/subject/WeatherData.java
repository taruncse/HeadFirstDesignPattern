package com.tkb.dp.observer.example1.subject;

import com.tkb.dp.observer.example1.interfaces.Observer;
import com.tkb.dp.observer.example1.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    float temperature, humidity,pressure;
    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void resister(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish() {
        for (Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        publish();
    }
}
