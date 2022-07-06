package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        MessengerFrame jFrame = new MessengerFrame();
        jFrame.setTitle("Messenger by Zerakles");
        jFrame.setSize(600,600);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
    }
}
