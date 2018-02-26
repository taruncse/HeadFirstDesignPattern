package com.tkb.dp.singleton;

public class SingleInstance {

    private static SingleInstance singleInstance;

    private SingleInstance(){

    }

    public static SingleInstance getSingleInstance() {
        if (singleInstance == null)
            singleInstance = new SingleInstance();
        return singleInstance;
    }
}
