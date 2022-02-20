import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double outer
            = new Ellipse2D.Double(xLeft +10, yTop +20, 200, 200);
        g2.fill(new Ellipse2D.Double(10,20,200,200));
        
        Ellipse2D.Double middle
            = new Ellipse2D.Double(xLeft + 50, yTop + 60, 120, 120);
        g2.setColor(new Color(255,255,255));
        g2.fill(new Ellipse2D.Double(50,60,120,120));
        
        Ellipse2D.Double inter
            = new Ellipse2D.Double(xLeft +90, yTop +100, 40, 40);
        g2.setColor(new Color(0,0,0));
        g2.fill(new Ellipse2D.Double(90,100, 40, 40));
        
        g2.draw(outer);
        g2.draw(middle);
        g2.draw(inter);
    }
}
