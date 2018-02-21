package com.tkb.dp.observer.swing;

import javax.swing.*;

public class SwingObserverExample {

    JFrame jFrame;

    public void go(){
        jFrame = new JFrame();
        JButton jButton = new JButton("Click Me");
        //First way of setting listener like previous example
        AngelListener angelListener = new AngelListener(jButton);

        jButton.addActionListener(new DevilListener());
        jButton.doClick();
    }
}
