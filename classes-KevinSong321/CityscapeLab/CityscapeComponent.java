import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
/**
 * This class calls the draw methods and animations on the objects
 * 
 * @Kevin Song
 * @10-11-18
 */

public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Building building1;
    private Building building2;
    private Building building3;
    private Building building4;
    private Part part;
    private Part part2;
    private Part part3;
    private Sun sun;
    private Cloud floating;
    private Cloud floating2;
    private Sky sky;
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    /**
     * Constructs a new Cityscape
     */
    public CityscapeComponent()
    {
       this.building1 = new Building(200,210);
       this.part = new Part(210,220, Color.BLACK);
       this.building2 = new Building(300,150);
       this.part2 = new Part(310,160, Color.BLACK);
       this.building3 = new Building(400,270);
       this.part3 = new Part(410, 280, Color.BLACK);
       this.sky = new Sky(0,0, Color.WHITE);
       this.sun = new Sun(345,60);
       this.floating = new Cloud(145,50);
       this.floating2 = new Cloud(500,70);
    }

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    @Override
    /**
     * Draws all the objects in the cityscape
     * 
     * @param  g  The graphics required to draw the object
     */
    public void paintComponent(Graphics g)
    {
        // invoke the draw method on each object in your Cityscape
        // ...
        Graphics2D g2 = (Graphics2D) g;
        sky.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        part.draw(g2);
        part2.draw(g2);
        part3.draw(g2);
        sun.draw(g2);
        floating.draw(g2);
        floating2.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        floating.animation();
        sky.animation();
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    public void nextFrame2()
    {
        // update the objects in the cityscape so they are animated
        // ...
       
        part.animation();
        part2.animation();
        part3.animation();
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
}
