package ru.zudilov.cryptoanalizer;

import ru.zudilov.cryptoanalizer.constans.Constans;
import ru.zudilov.cryptoanalizer.files.IOFiles;
import ru.zudilov.cryptoanalizer.parametrs.Parametrs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Coding {

    //Метод шифрует текс по шифру Цезаря
    public static void coding () {
        String string = IOFiles.readFile(Parametrs.getInputPath());
        ArrayList<Character> charText = new ArrayList<>();
        for (char ch : string.toCharArray()) {
            charText.add(ch);
        }
        int key = Parametrs.getKey();
        int k = key >= Constans.ALPHABET.size() ? -(Constans.ALPHABET.size() % key) : -key;
        for (int i = 0; i < charText.size(); i++) {
            for (int j = 0; j < Constans.ALPHABET.size(); j++) {
                if (charText.get(i).equals(Constans.ALPHABET.get(j))) {
                    Collections.rotate(Constans.ALPHABET, k);
                    charText.remove(i);
                    char ch = Constans.ALPHABET.get(j);
                    charText.add(i, ch);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (Object ch : charText) {
            result.append(ch);
        }
        IOFiles.writeFile(result.toString(), Parametrs.getOutputPath());
    }

}
