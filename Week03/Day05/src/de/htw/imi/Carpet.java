package de.htw.imi;

import java.applet.*;
import java.awt.Graphics;
import java.awt.Point;
import java.util.*;

public class Carpet extends Applet
{

    Graphics g;
    Point a1,b1,c1, a2,b2,c2, a3,b3,c3;

    static final int level = 10; //Recursion depth
    static final long serialVersionUID = 284927403;

    public void paint(Graphics g)
    {
        drawTriangle(g, new Point(0,getHeight()-1),new Point(getWidth(),getHeight()-1),new Point(getWidth()/2,0), level);
    }

    //Recursive method
    public void drawTriangle(Graphics g, Point a, Point b, Point c, int n)
    {
        if (n==0) return;
        if (n==level) g.drawPolygon(new int[]{a.x,b.x,c.x}, new int[]{a.y,b.y,c.y}, 3); //Initial Triangle
        n--;

        int xCoords[] = {c.x, (c.x+b.x)/2, (a.x+c.x)/2};
        int yCoords[] = {b.y, (c.y+a.y)/2, (c.y+a.y)/2};

/*        //Level based Colors
        Random random = new Random(level-n);
        g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));*/


        //Multicolor Sierpinski
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        //g.setColor(new Color(red,green,blue));


        g.fillPolygon(xCoords, yCoords, 3);

        // Three new Triangles
        a1 = a;
        b1 = new Point(c.x, b.y);
        c1 = new Point((a.x+c.x)/2, (c.y+a.y)/2);
        drawTriangle(g, a1, b1, c1, n);

        a2 = new Point(c.x, b.y);
        b2 = b;
        c2 = new Point((c.x+b.x)/2, (c.y+a.y)/2);
        drawTriangle(g, a2, b2, c2, n);

        a3 = new Point((a.x+c.x)/2, (c.y+a.y)/2);
        b3 = new Point((c.x+b.x)/2, (c.y+a.y)/2);
        c3 = c;
        drawTriangle(g, a3, b3, c3, n);
    }
}