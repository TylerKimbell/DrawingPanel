
/**
 * Author: Tyler Kimbell
 * Date: 10/19/12
 * CS312 Lab 5
 * On my honor, Tyler Kimbell, this programming assignment is my own work. 
 * 
 * A program that draws ovals and crosses inside a graphics panel. 
 * 
 * Slip days information. 
 * Number of slip days I am using on this assignment:0
 * Number of slip days I think I have so far this semester including this assignment: 3
 */
import java.awt.*;
public class Drawing1
{
    public static void main (String[] args)
    {
        DrawingPanel drawing1 = new DrawingPanel (400,200);
        drawing1.setBackground(Color.GREEN);
        Graphics g = drawing1.getGraphics();
        bigCross(g);
        g.setColor(Color.RED);
        ovals(g);
        g.setColor(Color.BLACK);
        smallCrosses(g);
    }
    public static void bigCross(Graphics g)
    {
        g.drawLine(200,200,200,0);
        g.drawLine(0,100,400,100);
    }
    public static void ovals(Graphics g)
    {
        g.fillOval(0,0,200,100);
        g.fillOval(200,100,200,100);
    }
    public static void smallCrosses(Graphics g)
    {
        g.drawLine(100,0,100,100);
        g.drawLine(0,50,200,50);
        g.drawLine(200,150,400,150);
        g.drawLine(300,100,300,200);
    }
}
