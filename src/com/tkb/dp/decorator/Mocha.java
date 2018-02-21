package com.tkb.dp.decorator;

public class Mocha extends CondimenentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+.5;
    }
}
