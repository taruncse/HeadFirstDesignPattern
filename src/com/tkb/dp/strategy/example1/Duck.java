package com.tkb.dp.strategy.example1;

import com.tkb.dp.strategy.example1.interfaces.FlyBehavior;
import com.tkb.dp.strategy.example1.interfaces.QuackBehavior;

public abstract class Duck {
    public abstract void display();

    public void swim(){
        System.out.println("Every duck can swim");
    }

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performFly(){
        if (flyBehavior != null)
            flyBehavior.fly();
        else
            System.out.println("Please set your fly strategy");
    }

    public void performQuack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }else {
            System.out.println("Please set your quack strategy");
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
