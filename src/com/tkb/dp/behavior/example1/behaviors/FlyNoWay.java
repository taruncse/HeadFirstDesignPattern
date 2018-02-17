package com.tkb.dp.behavior.example1.behaviors;

import com.tkb.dp.behavior.example1.behaviorInterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
