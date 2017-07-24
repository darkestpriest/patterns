package com.cardinal.template.ui;

import javax.swing.*;
import java.awt.*;

public class SuperFrame extends JFrame {

    public SuperFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String message = "Swing";
        graphics.drawString(message, 100, 100);
    }

    public static void main(String[] args) {
        SuperFrame superFrame = new SuperFrame("Testing");
    }
}
