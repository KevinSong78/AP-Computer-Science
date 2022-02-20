import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.Dimension;
import java.util.Scanner;
import java.awt.Color;

/**
 * Write a description of class DrawingShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class DrawingShape 
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    public DrawingShape(Point2D.Double center, double radius, Color color)
    {
         this.center = center;
         this.radius = radius;
         this.color = color;
    }
    public  Point2D.Double getCenter()
    {
        return center;
    }
    public double getRadius()
    {
        return radius;
    }
    public Color getColor()
    {
        return color;
    }
    public void move(double x, double y)
    {
        Point2D.Double newCenter = new Point2D.Double(x-radius/2,y-radius/2);
        center = newCenter;
        
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    abstract boolean isInside(Point2D.Double point);
    abstract boolean isOnBorder(Point2D.Double point);
    abstract void draw(Graphics2D g2, boolean filled);
    
}
