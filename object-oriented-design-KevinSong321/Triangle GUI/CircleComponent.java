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
/**
 * Write a description of class CircleComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleComponent extends JComponent
{
    private int circleRadius;
    private int circleX;
    private int circleY;
    
    public CircleComponent()
    {
       this.setPreferredSize(new Dimension(300, 300));
    
    }
    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double p = new Ellipse2D.Double(circleX,circleY, circleRadius, circleRadius);
        g2.draw(p);
    }
    public void drawCircle(int r, int x, int y)
    {
        circleRadius = r;
        circleX = x;
        circleY = y;
    }
  
    
}
