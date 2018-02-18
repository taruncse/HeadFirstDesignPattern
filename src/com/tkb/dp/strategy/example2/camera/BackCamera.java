package com.tkb.dp.strategy.example2.camera;

import com.tkb.dp.strategy.example2.interfaces.Photography;

public class BackCamera implements Photography{
    @Override
    public void takePicture(String location, String device) {
        System.out.println("Taking photo using Rear Camera to "+location+" Model: "+device);
    }

    @Override
    public void takeVideo(String location, String device) {
        System.out.println("Taking video using Rear Camera to "+location+" Model: "+device);
    }
}
