package ru.zudilov.cryptoanalizer;

public class DecodingQuality {

    public static double calculateAccuracy(String decryptedText, String referenceText) {
        String[] decryptedWords = decryptedText.split("\\s+");
        String[] referenceWords = referenceText.split("\\s+");

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