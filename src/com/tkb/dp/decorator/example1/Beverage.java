package com.tkb.dp.decorator.example1;

public abstract class Beverage {

    // We can add extra variable here
    public static int LARGE = 1;
    public  static int MEDIUM = 2;
    //////
    int size = 0;

    String description = "Unknown Bevarage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
