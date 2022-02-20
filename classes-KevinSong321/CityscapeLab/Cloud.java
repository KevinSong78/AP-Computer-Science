import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent; 
import java.awt.Color; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
/**
 * This class draws clouds that can move
 *
 * @Kevin Song
 * @10-11-18
 */
public class Cloud
{
    private int xLeft;
    private int yTop;
    /**
     * Constructs a new Cloud at position (x,y) 
     * 
     * @param  x  the x-position in the frame
     * @param  y  the y-position in the frame
     */
    public Cloud(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * Instructions for drawing the cloud
     * 
     * @param  g  The graphics required to draw the object
     */
    public void draw(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GRAY);
        
        Arc2D.Double leftside = new
         Arc2D.Double(xLeft,yTop,105,100,0,180,Arc2D.CHORD);
         g2.fill(leftside);
        Ellipse2D.Double middleside = new
         Ellipse2D.Double(xLeft + 60,yTop - 25,80,70);
         g2.fill(middleside);
        Arc2D.Double rightside = new
         Arc2D.Double(xLeft+ 100,yTop,100,100,0,180,Arc2D.CHORD);
         g2.fill(rightside);
    }
    /**
     * Moves the cloud to the right at a certain interval
     */
    public void animation()
    {
        xLeft += 10;
    }
}