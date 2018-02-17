package com.tkb.dp.behavior.example1.behaviors;

import com.tkb.dp.behavior.example1.behaviorInterface.FlyBehavior;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly with rocket");
    }
}
