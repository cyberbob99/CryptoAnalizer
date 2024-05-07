package ru.zudilov.cryptoanalizer.gui;
import java.awt.*;
import javax.swing.*;

public class SimpleGui extends JFrame {
    private JButton button = new JButton("Выполнить");
    private static JTextField inputPath = new JTextField("", 5);
    private JLabel label = new JLabel("Путь в файлу для шифровки");
    private static JTextField outputPath = new JTextField("", 5);
    private JLabel label1 = new JLabel("Путь в файлу для записи");
    private static JTextField key = new JTextField("", 2);
    private JLabel label2 = new JLabel("Ключ");
    static JRadioButton encryption = new JRadioButton("Зашифровать");
    static JRadioButton decoding = new JRadioButton("Расшифровать");
    static JRadioButton bruteForce = new JRadioButton("Взломать");
    static JRadioButton demo = new JRadioButton("Демо");

    public SimpleGui(){
        super("Шифр Цезаря");
        this.setBounds(100,100, 600, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6, 3, 15, 15));
        container.add(label);
        container.add(inputPath);
        container.add(label1);
        container.add(outputPath);
        container.add(label2);
        container.add(key);

        ButtonGroup group = new ButtonGroup();
        group.add(encryption);
        group.add(decoding);
        group.add(bruteForce);
        group.add(demo);

        container.add(encryption);
        encryption.setSelected(true);
        container.add(decoding);
        container.add(bruteForce);
        container.add(demo);
        button.addActionListener(new ButtonEventListener());
        container.add(button);

    }

    public static String getInputPath() {
        return inputPath.getText();
    }

    public static String getOutputPath() {
        return outputPath.getText();
    }

    public static int getKey() {
        return Integer.parseInt(key.getText());
    }
}
