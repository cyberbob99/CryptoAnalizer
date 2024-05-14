package ru.zudilov.cryptoanalizer.servis;

import ru.zudilov.cryptoanalizer.constans.Constants;
import ru.zudilov.cryptoanalizer.files.IOFiles;
import ru.zudilov.cryptoanalizer.gui.SimpleGui;

import java.util.ArrayList;
import java.util.Collections;

public class Decoding {

    private Decoding(){

    }
    //Метод для расшифровка шифра Цезаря
    public static void decoding() {
        String string = IOFiles.readFile(SimpleGui.getInputPath());
        ArrayList<Character> charText = new ArrayList<>();
        for (char ch : string.toCharArray()) {
            charText.add(ch);
        }
        int key = SimpleGui.getKey();
        int k = key >= Constants.ALPHABET.size() ? (Constants.ALPHABET.size() % key) : key;
        for (int i = 0; i < charText.size(); i++) {
            for (int j = 0; j < Constants.ALPHABET.size(); j++) {
                if (charText.get(i).equals(Constants.ALPHABET.get(j))) {
                    Collections.rotate(Constants.ALPHABET, k);
                    charText.remove(i);
                    char ch = Constants.ALPHABET.get(j);
                    charText.add(i, ch);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (Object ch : charText) {
            result.append(ch);
        }
        IOFiles.writeFile(result.toString(), SimpleGui.getOutputPath());
    }
}
