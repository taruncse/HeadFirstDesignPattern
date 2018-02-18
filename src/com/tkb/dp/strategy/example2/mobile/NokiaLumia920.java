package com.tkb.dp.strategy.example2.mobile;

import com.tkb.dp.strategy.example2.HandSet;
import com.tkb.dp.strategy.example2.camera.BackCamera;
import com.tkb.dp.strategy.example2.camera.FrontCamera;
/**
 *  Implement Concrete Classes from the Strategy
 */
public class NokiaLumia920 extends HandSet{
    @Override
    public void display() {
        System.out.println("Nokia Lumia 920, A full-featured phone from Nokia");
    }

    @Override
    public String device() {
        return "NokiaLumia920";
    }
    //Setting Behavior Dynamically
    public void setFrontCamera(){
        photography = new FrontCamera();
    }
    //Setting Behavior Dynamically
    public void setBackCamera(){
        photography = new BackCamera();
    }
}
