package com.tkb.dp;

import com.tkb.dp.observer.example2JavaObserver.CurrentConditionsDisplay;
import com.tkb.dp.observer.example2JavaObserver.WeatherData;
import com.tkb.dp.observer.swing.SwingObserverExample;

public class Main {

    //Observer

    public static void main(String[] args) {
        new SwingObserverExample().go();

    }
    /*
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(30,40,60);

    }
    public static void main(String[] args) {
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
