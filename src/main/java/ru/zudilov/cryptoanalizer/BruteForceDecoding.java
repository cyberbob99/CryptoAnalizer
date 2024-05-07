package ru.zudilov.cryptoanalizer;

import ru.zudilov.cryptoanalizer.constans.Constans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BruteForceDecoding {

    //Метод для взлома шифра Цезаря путем перебора
    public static void bruteForceDecoding(String text) {


        int count = 0;
        ArrayList<Character> charText = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            charText.add(ch);
        }
        StringBuilder result = new StringBuilder();
        while (count < Constans.ALPHABET.size()){
            for (int i = 0; i < charText.size(); i++) {
                for (int j = 0; j < Constans.ALPHABET.size(); j++) {
                    if (charText.get(i).equals(Constans.ALPHABET.get(j))) {
                        Collections.rotate(Constans.ALPHABET, 1);
                        charText.remove(i);
                        char ch = Constans.ALPHABET.get(j);
                        charText.add(i, ch);
                        for (Object object : charText) {
                            result.append(object);
                        }
                        System.out.println(result);
                    }
                }
            }
            count++;
            HashMap hashMap = new HashMap<>();
            double res =(int) DecodingQuality.calculateAccuracy(result.toString(), Constans.DICTIONARY);
            hashMap.put(res, result.toString());
        }


    }
}
