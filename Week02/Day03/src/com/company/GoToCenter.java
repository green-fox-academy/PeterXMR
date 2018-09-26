package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        int a1 = 10;
        int a2 = 10;
        int b1 = 10;
        int b2 = 290;
        int c1 = 290;
        int c2 = 10;
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(a1, a2, b1, b2, c1, c2));
        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            x = listOfNumbers.get(i * 2);
            y = listOfNumbers.get(i * 2 + 1);
            DrawLine(x,y,graphics);
        }

    }
        public static void DrawLine (int x, int y, Graphics graphics){
            graphics.setColor(Color.BLUE);
            graphics.drawLine(x,y,150,150);

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
