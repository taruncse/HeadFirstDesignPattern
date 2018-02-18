package com.tkb.dp.strategy.example2.mobile;

import com.tkb.dp.strategy.example2.HandSet;

/**
 *  Implement Concrete Classes from the Strategy
 */
public class Nokia5510 extends HandSet{
    @Override
    public void display() {
        System.out.println("This is a very basic model from Nokia with no camera whatsoever!!");
    }

    @Override
    public String device() {
        return "Nokia5510";
    }
}
