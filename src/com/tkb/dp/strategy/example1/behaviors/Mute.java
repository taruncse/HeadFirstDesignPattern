package com.tkb.dp.strategy.example1.behaviors;

import com.tkb.dp.strategy.example1.interfaces.QuackBehavior;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
