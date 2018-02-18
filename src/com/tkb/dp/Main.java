package com.tkb.dp;

import com.tkb.dp.strategy.example1.Duck;
import com.tkb.dp.strategy.example1.behaviors.FlyWithRocket;
import com.tkb.dp.strategy.example1.behaviors.FlyWithWings;
import com.tkb.dp.strategy.example1.behaviors.Quack;
import com.tkb.dp.strategy.example1.duck.RedheadDuck;
import com.tkb.dp.strategy.example1.duck.RubberDuck;
import com.tkb.dp.strategy.example2.HandSet;
import com.tkb.dp.strategy.example2.mobile.Nokia5510;
import com.tkb.dp.strategy.example2.mobile.NokiaLumia920;

public class Main {

    public static void main(String[] args) {
        HandSet nokia5510 = new Nokia5510();
        //handSet.set
        nokia5510.takePhoto("Memory Card");
        nokia5510.sendSms("017777","Hi how are you?");

        NokiaLumia920 nokiaLumia920 = new NokiaLumia920();
        nokiaLumia920.setFrontCamera();
        nokiaLumia920.takePhoto("Rom");

    }

    /*public static void main(String[] args) {
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
