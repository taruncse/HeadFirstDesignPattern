package com.tkb.dp.strategy.example2;

import com.tkb.dp.strategy.example2.interfaces.Photography;

public abstract class HandSet {
    public abstract void display();
    public abstract String device();

    public Photography photography;

    //Setting Behavior Dynamically
    public void setPhotographyDevice(Photography photography){
        this.photography = photography;
    }

    //Implement the Methods for the New Behavior
    public void takePhoto(String location){
        if (photography == null){
            System.out.println("You have no camera to take photo");
        }else {
            photography.takePicture(location,this.device());
        }
    }

    //Implement the Methods for the New Behavior
    public void takeVideo(String location){
        if (photography == null){
            System.out.println("You have no camera to take video");
        }else {
            photography.takeVideo(location,this.device());
        }
    }

    public void sendSms(String number, String text){
        System.out.println("Sending "+text+" message to: "+number);
    }

    public void call(String number){
        System.out.println("Calling to: "+number);
    }
}
