package com.tkb.dp.observer.example2JavaObserver;

import java.util.Observable;
// This is Concrete Subject.

public class WeatherData extends Observable {

    float temperature;
    float humidity;
    float pressure;

    public void publish() {

       setChanged();
       notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        publish();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
