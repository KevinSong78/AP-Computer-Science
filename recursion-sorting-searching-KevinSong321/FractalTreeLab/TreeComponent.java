import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
/**
 * Write a description of class TreeComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeComponent extends JPanel
{
    private final int PANEL_WIDTH = 1500;
    private final int PANEL_HEIGHT = 1200;

    private final double SQ = Math.sqrt(3.0) / 6;
    private int currentOrder; 

    public TreeComponent (int counter)
    {
        currentOrder = counter;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    public void drawFractal (int order, double x1, double y1, double angle, Graphics page)
    {
        Graphics2D g2 = (Graphics2D) page;
        double deltaX, deltaY, x2, y2, x3, y3, x4, y4;
        
        double degree;
        if (order == 0)
        {
            return;
        }
        else
        {
            degree = Math.toRadians(angle);
            x2 = x1 + Math.cos(degree) * 25;
            y2 = y1 - Math.sin(degree) * 25;
            
            if(order % 2 == 1){
                g2.setColor(Color.RED);
            }
            else if(order % 2 == 0)
            {
                g2.setColor(Color.PINK);
            }
            
            Line2D.Double line = new Line2D.Double( x1, y1, x2, y2 );
            g2.draw( line );
             
            drawFractal (order -1, x2, y2, angle + 10, page);
            drawFractal (order -1, x2, y2, angle - 10, page);
        }
    }
    public void paintComponent (Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLACK);
        
        drawFractal(currentOrder, 750, 600, 90, g2);
        
    }
}
