package ru.zudilov.cryptoanalizer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    private static final List<Character> ALPHABET = Arrays.asList('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
            'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
            'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' ');

    //Метод шифрует текс по шифру Цезаря
    public static StringBuilder Encryption(String text, int key) {
        ArrayList<Character> charText = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            charText.add(ch);
        }
        int k = key >= ALPHABET.size() ? -(ALPHABET.size() % key) : -key;
        for (int i = 0; i < charText.size(); i++) {
            for (int j = 0; j < ALPHABET.size(); j++) {
                if (charText.get(i).equals(ALPHABET.get(j))) {
                    Collections.rotate(ALPHABET, k);
                    charText.remove(i);
                    char ch = ALPHABET.get(j);
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

    //Метод для расшифровка шифра Цезаря
    public static StringBuilder Decoding(String text, int key) {
        ArrayList<Character> charText = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            charText.add(ch);
        }
        int k = key >= ALPHABET.size() ? (ALPHABET.size() % key) : key;
        for (int i = 0; i < charText.size(); i++) {
            for (int j = 0; j < ALPHABET.size(); j++) {
                if (charText.get(i).equals(ALPHABET.get(j))) {
                    Collections.rotate(ALPHABET, k);
                    charText.remove(i);
                    char ch = ALPHABET.get(j);
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

    public static void main(String[] args) {

        String string = "Папа, мама";
        String string1 = "Рбрб«Анбнб";
        int key = 1;
        System.out.println(Encryption(string, key));
        System.out.println(Decoding(string1, key));

    }
}