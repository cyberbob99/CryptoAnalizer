package ru.zudilov.cryptoanalizer.parametrs;

import ru.zudilov.cryptoanalizer.gui.SimpleGui;

public class Parametrs {
    private static String inputPath = SimpleGui.getInputPath();
    // путь к результату работы
    private static  String outputPath = SimpleGui.getOutputPath();
    // ключ шифрования
    private static  int key = SimpleGui.getKey();

    public static String getInputPath() {
        return inputPath;
    }

    public static String getOutputPath() {
        return outputPath;
    }

    public static int getKey() {
        return key;
    }

    public static void setInputPath(String inputPath) {
        Parametrs.inputPath = inputPath;
    }

    public static void setOutputPath(String outputPath) {
        Parametrs.outputPath = outputPath;
    }

    public static void setKey(int key) {
        Parametrs.key = key;
    }
}
