package com.company;

import javax.swing.*;
import java.awt.*;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        for (int i = 0; i < 10; i++) {

        }
        int a = (int) (20+(Math.random()*120));
        int c = (int) (Math.random()*60);
        int r = (int) (Math.random()*225);
        int g = (int) (Math.random()*225);
        int b = (int) (Math.random()*255);
        drawSquare(a,graphics);

        graphics.setColor(new Color(r,g,b));




    }
    public static void drawSquare (int a, Graphics graphics){
        graphics.fillRect(160-(a/2),172-(a/2),a,a);

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
