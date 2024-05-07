package ru.zudilov.cryptoanalizer;

import ru.zudilov.cryptoanalizer.constans.Constans;

import java.util.ArrayList;
import java.util.Collections;

public class Decoding {

    //Метод для расшифровка шифра Цезаря
    public static StringBuilder decoding(String text, int key) {
        ArrayList<Character> charText = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            charText.add(ch);
        }
        int k = key >= Constans.ALPHABET.size() ? (Constans.ALPHABET.size() % key) : key;
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
        return result;
    }
}
