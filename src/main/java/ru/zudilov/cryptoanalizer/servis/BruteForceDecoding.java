package ru.zudilov.cryptoanalizer.servis;

import ru.zudilov.cryptoanalizer.constans.Constants;
import ru.zudilov.cryptoanalizer.files.IOFiles;
import ru.zudilov.cryptoanalizer.gui.SimpleGui;

import java.util.ArrayList;
import java.util.Collections;


public class BruteForceDecoding {

    private BruteForceDecoding() {

    }

    //Метод для взлома шифра Цезаря путем перебора
    public static void bruteForceDecoding() {
        String string = IOFiles.readFile(SimpleGui.getInputPath());
        String out = new String();
        int count = 0;
        double score = 0.0;
        ArrayList<Character> charText = new ArrayList<>();
        for (char ch : string.toCharArray()) {
            charText.add(ch);
        }
        while (count < Constants.ALPHABET.size()) {
            for (int i = 0; i < charText.size(); i++) {
                String s = new String();
                for (int j = 0; j < Constants.ALPHABET.size(); j++) {
                    if (charText.get(i).equals(Constants.ALPHABET.get(j))) {
                        Collections.rotate(Constants.ALPHABET, 1);
                        charText.remove(i);
                        char ch = Constants.ALPHABET.get(j);
                        charText.add(i, ch);
                        for (char c : charText) {
                            s = s + c;
                        }
                        double res = calculateAccuracy(s);
                        if (res > score) {
                            score = res;
                            out = s;
                        }
                    }
                }
            }
            count++;
        }
        IOFiles.writeFile(out, SimpleGui.getOutputPath());
    }

    public static double calculateAccuracy(String decryptedText) {
        String[] decryptedWords = decryptedText.split("\\s+");
        String[] referenceWords = Constants.DICTIONARY.split("\\s+");
        int matchingWords = 0;
        for (String word : decryptedWords) {
            if (containsIgnoreCase(referenceWords, word)) {
                matchingWords++;
            }
        }
        return (double) matchingWords / referenceWords.length;
    }

    public static boolean containsIgnoreCase(String[] words, String target) {
        for (String word : words) {
            if (word.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }
}


