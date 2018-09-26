package com.company;

import javax.swing.*;
import java.awt.*;

public class LineInTheMiddle {
    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.red);
        graphics.drawLine(0, 150, 150, 0);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(150,150,0,0);
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
