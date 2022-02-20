import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D; 
import java.awt.Color;
/**
 * This program draws the building shell
 *
 * @Kevin Song
 * @10-11-18
 */
public class Building extends JComponent
{
    private int xLeft;
    private int yTop;
     /**
     * Constructs a new Building object at (x,y)
     * 
     * @param  x  the x-position in the frame
     * @param  y  the y-position in the frame
     */
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * Instructions for drawing the building
     * 
     * @param  g  The graphics required to draw the object
     */
    public void draw(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.DARK_GRAY);
        Rectangle2D.Double tall = new 
         Rectangle2D.Double(xLeft, yTop, 100, 600);
        g2.fill(tall);
    }

}

