package com.tkb.dp.singleton;

public class SingleInstance {

    private static volatile SingleInstance singleInstance;

    private SingleInstance(){

    }

    public static SingleInstance getSingleInstance() {
        if (singleInstance == null)
            synchronized (SingleInstance.class){
              if (singleInstance == null){
                  singleInstance = new SingleInstance();
              }
            }
        return singleInstance;
    }
}
