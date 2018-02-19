package com.tkb.dp.strategy.example2.camera;

import com.tkb.dp.strategy.example2.interfaces.Photography;

public class NoCamera implements Photography {
    @Override
    public void takePicture(String location, String device) {
        System.out.println("I can't take photo to "+location+" Model: "+device);
    }

    @Override
    public void takeVideo(String location, String device) {
        System.out.println("I can't record video to "+location+" Model: "+device);

    }
}
