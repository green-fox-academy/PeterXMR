package com.company;

import javax.swing.*;
import java.awt.*;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.RED);
        graphics.drawLine(10, 10, 10, 200);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(10, 200, 210, 200);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(210,200,210,10);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(210,10,10,10);



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
