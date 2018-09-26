package com.company;

import javax.swing.*;
import java.awt.*;

public class Workshop {
    public static void mainDraw(Graphics graphics){
        graphics.drawLine(10, 10, 200, 50);
        graphics.drawRect(100, 100, 120, 130);
        graphics.fillRect(110, 110, 130, 140);
        graphics.fillOval(180, 10, 230, 90);
        graphics.fillRect(200,200,200,200);
        graphics.setColor(new Color(200,200,0,150));
        graphics.fillRect(210,210,200,200);
        int xpoints[] = {25, 145, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};
        int npoints = 5;

        graphics.drawPolygon(xpoints, ypoints, npoints);
	// write your code here
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