package com.tkb.dp.strategy.example1.duck;

import com.tkb.dp.strategy.example1.Duck;
import com.tkb.dp.strategy.example1.behaviors.FlyNoWay;
import com.tkb.dp.strategy.example1.behaviors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
