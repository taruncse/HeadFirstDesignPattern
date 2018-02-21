package com.tkb.dp;

import com.tkb.dp.observer.example1.observer.StatisticsDisplay;
import com.tkb.dp.observer.example1.subject.WeatherData;
import com.tkb.dp.observer.example2JavaObserver.CurrentConditionsDisplay;
import com.tkb.dp.strategy.example1.Duck;
import com.tkb.dp.strategy.example1.behaviors.FlyWithRocket;
import com.tkb.dp.strategy.example1.behaviors.FlyWithWings;
import com.tkb.dp.strategy.example1.behaviors.Quack;
import com.tkb.dp.strategy.example1.duck.RedheadDuck;
import com.tkb.dp.strategy.example1.duck.RubberDuck;
import com.tkb.dp.strategy.example2.HandSet;
import com.tkb.dp.strategy.example2.camera.BackCamera;
import com.tkb.dp.strategy.example2.camera.FrontCamera;
import com.tkb.dp.strategy.example2.camera.NoCamera;
import com.tkb.dp.strategy.example2.mobile.Nokia5510;
import com.tkb.dp.strategy.example2.mobile.NokiaLumia920;

public class Main {

    //Observer
    public static void main(String[] args) {
        com.tkb.dp.observer.example2JavaObserver.WeatherData weatherData = new com.tkb.dp.observer.example2JavaObserver.WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(30,40,60);

    }
    /*public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(10,50,86);

        weatherData.remove(currentConditionsDisplay);
        weatherData.setMeasurements(14,51,76);
    }*/
    /*
    Strategy

    public static void main(String[] args) {
        HandSet nokia5510 = new Nokia5510();
        //handSet.set
        nokia5510.takePhoto("Memory Card");
        nokia5510.sendSms("017777","Hi how are you?");
        nokia5510.setPhotographyDevice(new NoCamera());
        nokia5510.takePhoto("Memory Card");

        NokiaLumia920 nokiaLumia920 = new NokiaLumia920();
        nokiaLumia920.setPhotographyDevice(new FrontCamera());
        nokiaLumia920.takePhoto("Rom");

    }

    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        rubberDuck.setFlyBehavior(new FlyWithRocket());
        rubberDuck.performFly();

        Duck readHeadDuck = new RedheadDuck();
        readHeadDuck.performFly();

        readHeadDuck.setFlyBehavior(new FlyWithWings());
        readHeadDuck.setQuackBehavior(new Quack());
        readHeadDuck.performFly();
        readHeadDuck.performQuack();

    }*/
}
