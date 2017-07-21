package com.cardinal.observer.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by maperez on 20/7/2017.
 */
public class ObserverView {
    private JFrame jFrame;

    public static void main(String[] args) {
        ObserverView observerView = new ObserverView();
        observerView.run();
    }

    public void run() {
        jFrame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new VeryGoodListener());
        button.addActionListener(new EvilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    class VeryGoodListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Yes, why not?");
        }
    }

    class EvilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Your world is gonna blow, do it!!");
        }
    }
}
