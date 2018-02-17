package com.tkb.dp;

import com.tkb.dp.behavior.example1.Duck;
import com.tkb.dp.behavior.example1.behaviors.FlyWithRocket;
import com.tkb.dp.behavior.example1.duck.RubberDuck;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        rubberDuck.setFlyBehavior(new FlyWithRocket());
        rubberDuck.performFly();
    }
}
