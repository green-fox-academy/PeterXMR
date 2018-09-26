package com.company;

import javax.swing.*;
import java.awt.*;

public class FourRectangles {
    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i < 4 ; i++) {
        int r = (int) (Math.random()*225);
        int g = (int) (Math.random()*255);
        int b = (int) (Math.random()*255);
        int random = 10 +  (int)(Math.random()*(120));
        int a = random;
        int e = random;
        int c = random;
        int d = random;
        graphics.setColor(new Color(r,g,b));
        graphics.drawRect(a,e,c,d);
        }

    }





    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}