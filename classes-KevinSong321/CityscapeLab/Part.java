import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D; 
import java.awt.Color; 
/**
 * This class draws the windows for the buildings that can change color
 *
 * @Kevin Song
 * @10-11-18
 */
public class Part extends JComponent
{
    private int xLeft;
    private int yTop;
    // Instance variable to define how many windows to make
    private int amount = 30;
    // Instance variables to align each window equally
    private int xparts_multiplier;
    private int yparts_multiplier;
    private int parts_duplicate;
    // Instance variable to assign each one the same color
    private Color windowColor;
    /**
     * Constructs a new Part object that serves as the frame for each window
     * 
     * @param  x  the x-position in the frame
     * @param  y  the y-position in the frame
     * @param  windColor  the initial color of the windows
     */
    public Part(int x, int y, Color windColor)
    {
        xLeft = x;
        yTop = y;
        windowColor = windColor;
    }
    /**
     * Instructions for drawing the parts
     * 
     * @param  g  The graphics required to draw the object
     */
    public void draw(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        for(int parts = 0; parts<amount; parts++ )
        {
            parts_duplicate = parts;
            if (parts % 3 == 0)
            {
                yparts_multiplier = parts_duplicate * 20;
                parts_duplicate = 0;
                xparts_multiplier = parts_duplicate * 30;
            }
            if (parts % 3 == 1)
            {
                parts_duplicate = 1;
                xparts_multiplier = parts_duplicate * 30;
            }
            if (parts % 3 == 2)
            {
                parts_duplicate = 2;
                xparts_multiplier = parts_duplicate * 30;
            }
            Rectangle2D.Double part = new
             Rectangle2D.Double(xLeft + xparts_multiplier,yTop + yparts_multiplier, 0, 0);
            g2.setColor(windowColor);
            g2.fillRect(xLeft + xparts_multiplier,yTop + yparts_multiplier,20,30);
        }
    }
    /**
     * Changes the window color according to the previous color
     */
    public void animation()
    {
        if (windowColor == Color.ORANGE)
        {
            windowColor = Color.YELLOW;
        }
        if (windowColor == Color.RED)
        {
            windowColor = Color.ORANGE;
        }
        if (windowColor == Color.BLACK)
        {
            windowColor = Color.RED;
        }
        
    }
}

