package com.tkb.dp.strategy.example1.behaviors;

import com.tkb.dp.strategy.example1.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
