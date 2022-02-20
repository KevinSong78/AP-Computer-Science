import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.Dimension;
import java.util.Scanner;
import java.awt.Color;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends DrawingShape
{
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        
    }
    public boolean isInside(Point2D.Double point)
    {
        if(point.getX() > super.getCenter().getX()-super.getRadius() && point.getX() <super.getCenter().getX() + super.getRadius() 
        && point.getY() > super.getCenter().getY() - super.getRadius() && point.getY() < super.getCenter().getY() + super.getRadius())
          {
              return true;
            }
            else
            {
                return false;
            }
    }
    public boolean isOnBorder(Point2D.Double point)
    {
        if(point.getX() == super.getCenter().getX()-super.getRadius() || point.getX() ==super.getCenter().getX() + super.getRadius()) 
        {
           if(point.getY() == super.getCenter().getY())
           {
               return true;
            }
        }
        else if(point.getY() == super.getCenter().getY() - super.getRadius() || point.getY() == super.getCenter().getY() + super.getRadius())
        {
           if(point.getX() == super.getCenter().getX())
           {
               return true;
            }
        }
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius());
        g2.draw(circle);
        g2.setColor(getColor());
        if(filled == true){
            g2.fill(circle);
        }
    }
}
