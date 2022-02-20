import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
public class TriangleComponent extends JComponent
{
    private static final int MAX_POINTS = 3;
    
    private ArrayList<Ellipse2D> circles ;
    private Line2D[] lines;
  
    public TriangleComponent()
    {
        this.addMouseListener( new MouseClickListener());
        circles = new ArrayList<>();
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        if(circles.size() == 1){
            g2.draw(circles.get(0));
            
        }
        else if(circles.size() == 2){
            g2.draw(circles.get(0));
            g2.draw(circles.get(1));
            Line2D.Double p = new Line2D.Double(circles.get(0).getX(), circles.get(0).getY(), circles.get(1).getX(), circles.get(1).getY());
            g2.draw(p);
        }
        else if(circles.size() == 3){
            g2.draw(circles.get(0));
            g2.draw(circles.get(1));
            g2.draw(circles.get(2));
            Line2D.Double p = new Line2D.Double(circles.get(0).getX(), circles.get(0).getY(), circles.get(1).getX(), circles.get(1).getY());
            Line2D.Double p2 = new Line2D.Double(circles.get(0).getX(), circles.get(0).getY(), circles.get(2).getX(), circles.get(2).getY());
            Line2D.Double p3 = new Line2D.Double(circles.get(1).getX(), circles.get(1).getY(), circles.get(2).getX(), circles.get(2).getY());
            g2.draw(p);
            g2.draw(p2);
            g2.draw(p3);
        }
        else if (circles.size() == 4){
      
           circles.clear();
        }
        
    }
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            
            System.out.println(event.getX() + "|" + event.getY());
            int xcoord = event.getX();
            int ycoord = event.getY();
            Ellipse2D.Double p = new Ellipse2D.Double(xcoord, ycoord, 1, 1);
            circles.add(p);
            repaint();
        }

        public void mouseEntered( MouseEvent event )
        {
        }

        public void mouseExited( MouseEvent event )
        {
        }

        public void mousePressed( MouseEvent event )
        {
        }

        public void mouseReleased( MouseEvent event )
        {
        }
    }

}