package com.chandni;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        final JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
