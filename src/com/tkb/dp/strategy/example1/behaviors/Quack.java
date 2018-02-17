package com.tkb.dp.strategy.example1.behaviors;

import com.tkb.dp.strategy.example1.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack");

    }
}
