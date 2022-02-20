import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;
import java.awt.geom.Dimension2D;
import java.util.Random;
/**
 * The panel in which draws all of the shapes in the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingPanel extends JPanel
{   
    int mostRecent;
    Color fillColor;
    ArrayList<DrawingShape> shapeList;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {     
        shapeList = new ArrayList<DrawingShape>();
        this.addMouseListener( new MouseClickListener());
        this.addMouseMotionListener( new MouseMovementListener());
        mostRecent = -1;
        
    }
    /**
     * This method sets the size of the drawing frame
     */
    public Dimension getPreferredSize()
    {
        this.setSize(600,600);
        return this.getSize();
    }
    /**
     * This method adds a circle with a random radius between a range to the drawing panel
     */
    public void addCircle()
    {
        Point2D.Double center = new Point2D.Double(10,10);
        Circle c = new Circle(center,(int)(30 + Math.random()*70), fillColor);
        shapeList.add(c);
    }
    /**
     * This method is called every time repaint() is called
     */
   public void paintComponent(Graphics g)
   {
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        for(DrawingShape s : shapeList){
            if(mostRecent == -1) // Prevents index out of bounds errors
            {
                s.draw(g2, true);
            }
            else{
             if(shapeList.get(mostRecent) == s)
             {
                 s.draw(g2,false);
             }
             else
             {
                 s.draw(g2,true);
             }
            }
        }
    }
    /**
     * This method adds a square of a random apothem to the drawing panel
     */
    public void addSquare()
    {
        Point2D.Double center = new Point2D.Double(10,10);
        Square c = new Square(center,(int)(Math.random()*100), fillColor);
        shapeList.add(c);
    }
    /**
     * Invoked when the "Pick Color" button is clicked. Displays a JColorChooser and sets the
     *  selected color as the new fill color. Leaves the fill color unchanged if the user clicks
     *  "Cancel"
     *
     */
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.fillColor );
        
        if( selectedColor != null )
        {
            this.fillColor = selectedColor;
        }
    }
    /**
     * Returns the color currently selected
     */
    public Color getColor()
    {
        return fillColor;
    }
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event ) {}
        public void mouseEntered( MouseEvent event ) {}
        public void mouseExited( MouseEvent event ){}
        /**
         * Called every time the mouse is clicked, checks if it is within any shapes, otherwise it assumes no shapes were selected
         */
        public void mousePressed( MouseEvent event )
        {
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            mostRecent = -1;
            for(DrawingShape s : shapeList)
            {
                if(s.isInside(point) == true)
                {
                    mostRecent = shapeList.indexOf(s);
                    repaint();
                }
            }
            repaint();
        }
        public void mouseReleased( MouseEvent event ){}
    }
    public class MouseMovementListener implements MouseMotionListener
    {
        /**
         * Called when the mouse is being dragged while held down
         */
        public void mouseDragged( MouseEvent event )
        {
            if(mostRecent != -1){
                shapeList.get(mostRecent).move(event.getX(), event.getY());
                repaint();
            }
        }
        public void mouseMoved( MouseEvent event)
        {
        }
    }
    
    
    
}
