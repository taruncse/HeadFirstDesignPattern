package com.tkb.dp.observer.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
    JButton jButton;
    public AngelListener(JButton jButton){
        this.jButton = jButton;
        jButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(" Hi here is Angel");
    }
}
