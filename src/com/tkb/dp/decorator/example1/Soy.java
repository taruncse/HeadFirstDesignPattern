package com.tkb.dp.decorator.example1;

public class Soy extends CondimenentDecorator {
    Beverage beverage ;


    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        int size = getSize();
        if (size == Beverage.MEDIUM){
            return this.beverage.description + ", Soy Medium";
        }else{
            return this.beverage.description + ", Soy Large";
        }
    }

    @Override
    public double cost() {

        int size = getSize();
        double totalCost = beverage.cost();

        if (size == Beverage.MEDIUM){
            totalCost = totalCost + .3;
        }else{
            totalCost = totalCost + .5;
        }
        return totalCost;
    }
}
