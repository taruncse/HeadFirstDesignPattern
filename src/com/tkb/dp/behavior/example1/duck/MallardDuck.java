package com.tkb.dp.behavior.example1.duck;

import com.tkb.dp.behavior.example1.Duck;
import com.tkb.dp.behavior.example1.behaviors.FlyWithWings;
import com.tkb.dp.behavior.example1.behaviors.Quack;

public class MallardDuck extends Duck {

    MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
