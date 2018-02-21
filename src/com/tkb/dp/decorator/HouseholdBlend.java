package com.tkb.dp.decorator;

public class HouseholdBlend extends Beverage{

    public HouseholdBlend(){
        description = "HouseholdBlend";
    }
    @Override
    public double cost() {
        return 1.7;
    }
}
