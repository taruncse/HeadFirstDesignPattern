package com.tkb.dp.strategy.example2.camera;

import com.tkb.dp.strategy.example2.interfaces.Photography;

public class FrontCamera implements Photography{
    @Override
    public void takePicture(String location, String device) {
        System.out.println("Taking photo using Front Camera to "+location+" Model: "+device);
    }

    @Override
    public void takeVideo(String location, String device) {
        System.out.println("Taking video using Front Camera to "+location+" Model: "+device);

    }
}
