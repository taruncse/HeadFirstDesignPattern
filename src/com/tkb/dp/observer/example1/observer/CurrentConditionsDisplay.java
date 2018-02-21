package com.tkb.dp.observer.example1.observer;

import com.tkb.dp.observer.example1.interfaces.DisplayElement;
import com.tkb.dp.observer.example1.interfaces.Observer;
import com.tkb.dp.observer.example1.interfaces.Subject;
// This is concrete observer

public class CurrentConditionsDisplay  implements Observer, DisplayElement {

    float temperature, humidity,pressure;

    public CurrentConditionsDisplay(Subject subject){
        subject.resister(this);
    }
    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
