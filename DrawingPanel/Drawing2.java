
/**
 * Author: Tyler Kimbell
 * Date: 10/19/12
 * CS312 Lab 5
 * On my honor, Tyler Kimbell, this programming assignment is my own work. 
 * 
 * This program draws grids of squares with concentric circles inside of them. 
 * 
 * Slip days information. 
 * Number of slip days I am using on this assignment:0
 * Number of slip days I think I have so far this semester including this assignment: 3
 */
import java.awt.*;
public class Drawing2
{
    //The main method creates a drawing panel and calls the other methods with parameters. 
    public static void main (String[] args)
    {
        DrawingPanel drawing1 = new DrawingPanel (550,450);
        drawing1.setBackground(Color.CYAN);
        Graphics g = drawing1.getGraphics();
        circleSquare(g, 0, 0, 100, 10);
        grid(g, 8, 12, 155, 30, 5);
        grid(g, 4, 305, 10, 48, 6);
        grid(g, 3, 300, 225, 70, 7); 
             
        
    }
    //The circleSquare method constructs a single square with concentric circles inside of it. 
    public static void circleSquare(Graphics g, int k, int l, int j, int c)
    {
           g.setColor(Color.GREEN);
           g.fillRect(k,l,j,j);
           g.setColor(Color.BLACK);
           g.drawRect(k,l,j,j);
           for(int i = 0; i<=j; i+=j/c)
           {
               int r = (j/2)-i/2;
               int x = k+r;
               int y = l+r;
               g.drawOval(x,y,i,i);
           }
    }
    //The grid method calls on the circleSquare method in a nested for loop in order to make a grid.
    public static void grid(Graphics g, int m, int k, int l, int j, int c)
    {
        for(int t = 0; t<m; t++)
        {
           for(int u = 0; u<m; u++)
           {
               circleSquare(g, k+j*u, l, j, c);
           }
           l+=j;
        }
    } 
}
    
 