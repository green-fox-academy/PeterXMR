package com.company;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int x1 = 200;
        int y1 = 350;
        int x2 = 215;
        int y2 = 370;
        int x3 = 185;
        int y3 = 370;
        /*graphics.drawLine(x1,y1,x2,y2);
        graphics.drawLine(x1,y1,x3,y3);
        graphics.drawLine(x2,y2,x3,y3);*/


        for (int a = 0; a <= 420; a += 30) {
            int b = +80;
            int x = +60;
            graphics.drawLine(x1 + a - x, y1+ b, x2 + a - x, y2+ b);
            graphics.drawLine(x1 + a - x, y1+ b, x3 + a - x, y3+ b);
            graphics.drawLine(x2 + a - x, y2+ b, x3 + a - x, y3+ b);
        }

        for (int a = 0; a <= 390; a += 30) {
            int b = +60;
            int x = +45;
            graphics.drawLine(x1 + a - x, y1+ b, x2 + a - x, y2+ b);
            graphics.drawLine(x1 + a - x, y1+ b, x3 + a - x, y3+ b);
            graphics.drawLine(x2 + a - x, y2+ b, x3 + a - x, y3+ b);
        }


        for (int a = 0; a <= 360; a += 30) {
            int b = +40;
            int x = +30;
            graphics.drawLine(x1 + a - x, y1+ b, x2 + a - x, y2+ b);
            graphics.drawLine(x1 + a - x, y1+ b, x3 + a - x, y3+ b);
            graphics.drawLine(x2 + a - x, y2+ b, x3 + a - x, y3+ b);
        }
        for (int a = 0; a <= 330; a += 30) {
            int b = +20;
            int x = +15;
            graphics.drawLine(x1 + a - x, y1+ b, x2 + a - x, y2+ b);
            graphics.drawLine(x1 + a - x, y1+ b, x3 + a - x, y3+ b);
            graphics.drawLine(x2 + a - x, y2+ b, x3 + a - x, y3+ b);
        }


        for (int a = 0; a <= 300; a += 30) {
            graphics.drawLine(x1 + a, y1, x2 + a, y2);
            graphics.drawLine(x1 + a, y1, x3 + a, y3);
            graphics.drawLine(x2 + a, y2, x3 + a, y3);
        }

        for (int c = 0; c <= 270; c += 30) {
            int b = -20;
            int x = +15;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);

        }

        for (int c = 0; c <= 240; c += 30) {
            int b = -40;
            int x = +30;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }

        for (int c = 0; c <= 210; c += 30) {
            int b = -60;
            int x = +45;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }

        for (int c = 0; c <= 180; c += 30) {
            int b = -80;
            int x = +60;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }

        for (int c = 0; c <= 150; c += 30) {
            int b = -100;
            int x = +75;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }


        for (int c = 0; c <= 120; c += 30) {
            int b = -120;
            int x = +90;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }


        for (int c = 0; c <= 90; c += 30) {
            int b = -140;
            int x = +105;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }

        for (int c = 0; c <= 60; c += 30) {
            int b = -160;
            int x = +120;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }


        for (int c = 0; c <= 30; c += 30) {
            int b = -180;
            int x = +135;
            graphics.drawLine(x1 + c + x, y1 + b, x2 + c + x, y2 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x1 + c + x, y1 + b, x3 + c + x, y3 + b);
            graphics.drawLine(x2 + c + x, y2 + b, x3 + c + x, y3 + b);
        }


        int b = -200;
        int x = +150;
        graphics.drawLine(x1 + x, y1 + b, x2 + x, y2 + b);
        graphics.drawLine(x1 + x, y1 + b, x3 + x, y3 + b);
        graphics.drawLine(x1 + x, y1 + b, x3 + x, y3 + b);
        graphics.drawLine(x2 + x, y2 + b, x3 + x, y3 + b);


    }
        // Don't touch the code below
        static int WIDTH = 1320;
        static int HEIGHT = 1343;

        public static void main (String[]args){
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
