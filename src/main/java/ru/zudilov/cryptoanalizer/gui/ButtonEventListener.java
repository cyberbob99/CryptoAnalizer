package ru.zudilov.cryptoanalizer.gui;

import ru.zudilov.cryptoanalizer.BruteForceDecoding;
import ru.zudilov.cryptoanalizer.Coding;
import ru.zudilov.cryptoanalizer.Decoding;
import ru.zudilov.cryptoanalizer.parametrs.Parametrs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        Parametrs.setInputPath(SimpleGui.getInputPath());
        Parametrs.setOutputPath(SimpleGui.getOutputPath());
        Parametrs.setKey(SimpleGui.getKey());
        if (SimpleGui.encryption.isSelected()){
            Coding.coding();
        } else if (SimpleGui.decoding.isSelected()) {
            Decoding.decoding();
        } else if (SimpleGui.bruteForce.isSelected()) {

        } else if (SimpleGui.demo.isSelected()) {
            
        }

    }
}
