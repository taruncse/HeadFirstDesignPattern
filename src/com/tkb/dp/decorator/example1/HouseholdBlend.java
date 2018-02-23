package com.tkb.dp.decorator.example1;

public class HouseholdBlend extends Beverage{

    public HouseholdBlend(){
        description = "HouseholdBlend";
    }
    @Override
    public double cost() {
        return 1.7;
    }
}
