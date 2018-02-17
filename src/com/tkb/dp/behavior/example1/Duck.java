package com.tkb.dp.behavior.example1;

import com.tkb.dp.behavior.example1.behaviorInterface.FlyBehavior;
import com.tkb.dp.behavior.example1.behaviorInterface.QuackBehavior;

public abstract class Duck {
    public abstract void display();

    public void swim(){
        System.out.println("Every duck can swim");
    }

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
