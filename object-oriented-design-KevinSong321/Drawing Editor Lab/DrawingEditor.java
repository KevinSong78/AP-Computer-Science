import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
/**
 * The window for the drawing editor.
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingEditor extends JFrame
{
    
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSize(600,600);
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel( canvas );
        
        // add the canvas and controls panels to the frame
        // read the BorderLayout class documentation for specifics
        this.add(canvas, BorderLayout.CENTER);
        this.add(controls, BorderLayout.SOUTH);

        this.pack();
        this.setVisible( true );
    }
    
    
    public static void main( String[] args )
    {
       DrawingEditor drawingEditor = new DrawingEditor();
    }

}
