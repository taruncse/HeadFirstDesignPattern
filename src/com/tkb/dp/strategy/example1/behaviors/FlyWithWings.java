package com.tkb.dp.strategy.example1.behaviors;

import com.tkb.dp.strategy.example1.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");

    }
}
