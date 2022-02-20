import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Frame extends JFrame
{
    public Frame()
    {
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSize(600,600);
        
        LogSpiralPanel panel = new LogSpiralPanel();
        this.add(panel);

        this.setVisible( true );
        
    }
    
    public static void main(String[] args)
    {
        Frame frame = new Frame();
      
    }
}

