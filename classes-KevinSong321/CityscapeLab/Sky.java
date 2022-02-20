import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D; 
import java.awt.Color;
/**
 * This program draws and changes the sky as the cloud moves over the sun.
 * 
 * @Kevin Song
 * @10-11-18
 */
public class Sky extends JComponent
{
    private int xLeft;
    private int yTop;
    private Color skyColor;
    /**
     * Constructs a new Sky at position (x,y) 
     * 
     * @param  x  the x-position in the frame
     * @param  y  the y-position in the frame
     */
   public Sky(int x, int y, Color backColor)
    {
        xLeft = x;
        yTop = y;
        skyColor = backColor;
    }
    /**
     * Instructions for drawing the sky
     * 
     * @param  g  The graphics required to draw the object
     */
   public void draw(Graphics g)
   {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(skyColor);
        Rectangle2D.Double sky = new 
         Rectangle2D.Double(xLeft, yTop, 800, 600);
        g2.fill(sky);
   }
   /**
    * Changes the background color according to the previous color
    */
   public void animation()
   {
       if (skyColor == Color.DARK_GRAY)
        {
            skyColor = Color.BLACK;
        }
        if (skyColor == Color.GRAY)
        {
            skyColor = Color.DARK_GRAY;
        }
        if (skyColor == Color.LIGHT_GRAY)
        {
            skyColor = Color.GRAY;
        }
        if (skyColor == Color.BLUE)
        {
            skyColor = Color.LIGHT_GRAY;
        }
        if (skyColor == Color.WHITE)
        {
            skyColor = Color.BLUE;
        }
   }

}

