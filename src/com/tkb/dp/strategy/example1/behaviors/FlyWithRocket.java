package com.tkb.dp.strategy.example1.behaviors;

import com.tkb.dp.strategy.example1.interfaces.FlyBehavior;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly with rocket");
    }
}
