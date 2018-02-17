package com.tkb.dp.behavior.example1.behaviors;

import com.tkb.dp.behavior.example1.behaviorInterface.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can squeak");

    }
}
