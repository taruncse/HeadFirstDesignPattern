package com.tkb.dp.observer.example1.interfaces;

public interface Subject {
    void resister(Observer observer);
    void remove(Observer observer);
    void publish();
}
