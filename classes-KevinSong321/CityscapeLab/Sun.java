import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color; 
import java.awt.geom.Ellipse2D;

/**
 * This class draws the sun
 *
 * @Kevin Song
 * @10-11-18
 */
public class Sun
{
    private int xLeft;
    private int yTop;
    /**
     * Constructs a new Sun at position (x,y) 
     * 
     * @param  x  the x-position in the frame
     * @param  y  the y-position in the frame
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * Instructions for drawing the sun
     * 
     * @param  g  The graphics required to draw the object
     */
    public void draw(Graphics g)
    {
        /**
         * The Sun
         */
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.YELLOW);
        Ellipse2D.Double sun
            = new Ellipse2D.Double(xLeft , yTop , 35, 35);
        g2.fillOval(xLeft,yTop,35,35);
    }
}