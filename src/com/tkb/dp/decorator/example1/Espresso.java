package com.tkb.dp.decorator.example1;

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.9;
    }
}
