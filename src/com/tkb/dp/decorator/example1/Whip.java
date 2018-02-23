package com.tkb.dp.decorator.example1;

public class Whip extends CondimenentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.2;
    }
}
