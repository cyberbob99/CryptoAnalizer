package ru.zudilov.cryptoanalizer.gui;

import ru.zudilov.cryptoanalizer.servis.BruteForceDecoding;
import ru.zudilov.cryptoanalizer.servis.Coding;
import ru.zudilov.cryptoanalizer.servis.Decoding;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        if (SimpleGui.encryption.isSelected()){

            Coding.coding();
        } else if (SimpleGui.decoding.isSelected()) {

            Decoding.decoding();
        } else if (SimpleGui.bruteForce.isSelected()) {

            BruteForceDecoding.bruteForceDecoding();
        }

    }
}
