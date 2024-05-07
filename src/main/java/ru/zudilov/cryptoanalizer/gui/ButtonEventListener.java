package ru.zudilov.cryptoanalizer.gui;

import ru.zudilov.cryptoanalizer.Coding;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "Путь к результатам работы " + SimpleGui.getOutputPath() + "\n";
        if (SimpleGui.encryption.isSelected()){
            
        } else if (SimpleGui.decoding.isSelected()) {
            
        } else if (SimpleGui.bruteForce.isSelected()) {
            
        } else if (SimpleGui.demo.isSelected()) {
            
        }
        JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);
    }
}
