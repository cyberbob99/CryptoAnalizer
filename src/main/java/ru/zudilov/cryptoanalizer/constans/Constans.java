package ru.zudilov.cryptoanalizer.constans;

import ru.zudilov.cryptoanalizer.gui.SimpleGui;

import java.util.Arrays;
import java.util.List;

public class Constans {
    public static final List<Character> ALPHABET = Arrays.asList('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
            'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
            'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' ');
    public static final String inputPath = SimpleGui.getInputPath();
    public static final String outputPath = SimpleGui.getOutputPath();
    public static final String key = SimpleGui.getKey();

    public static final String demoInput = "У лукоморья дуб зелёный Златая цепь на дубе том:";

    public static final String demoKey = "2";

}
