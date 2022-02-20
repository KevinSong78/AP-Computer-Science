import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
/**
 * The panel that contains the controls and indicators for the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class ControlPanel extends JPanel
{
    //
    // .. add additional instance variables
    //
    private DrawingPanel canvas;
    private JButton color;
    private JButton circle;
    private JButton square;
    private JPanel colorPicture;
 
    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel( DrawingPanel canvas)
    {
        this.canvas = canvas;
        //
        // ... create and add buttons and selected color panel
        //
        color = new JButton("Pick color: ");
        circle = new JButton("Add circle");
        square = new JButton("Add square");
        colorPicture = new JPanel();
        
        add(color);
         add(colorPicture);
        add(circle);
        add(square);
 
        //
        // ... create inner class that implements the ActionListener interface to respond to button clicks
        //
        ActionListener listener1 = new ActionListener()
        {     
               public void actionPerformed(ActionEvent event)
               {
                  canvas.pickColor();
                  colorPicture.setBackground(canvas.getColor());
                } 
        };
        color.addActionListener(listener1);
        
        ActionListener listener2 = new ActionListener()
        {
               public void actionPerformed(ActionEvent event)
               {
                   canvas.addCircle();
                   canvas.repaint();
                } 
        };
        circle.addActionListener(listener2);
        
        ActionListener listener3 = new ActionListener()
        {
               public void actionPerformed(ActionEvent event)
               {
                   canvas.addSquare();
                   canvas.repaint();
                } 
        };
        square.addActionListener(listener3);
    }
}
