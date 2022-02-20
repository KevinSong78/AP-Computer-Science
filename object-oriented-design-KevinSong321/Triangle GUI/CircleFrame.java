import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 * Write a description of class CircleGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleFrame extends JFrame
{
    
    private CircleComponent component;
    private JPanel panel;
    private JButton button1;
    
    
    public static void main(String[] args)
    {
        CircleFrame gui = new CircleFrame();
    }
    public CircleFrame()
    {
        this.setTitle("Yes");
        component = new CircleComponent();
        panel = new JPanel();
        button1 = new JButton("Greetings");
        
        panel.add(component);
        panel.add(button1);
        
        this.add(panel);
        
        ActionListener listener = new ActionListener()
         {
               private JOptionPane input;
               String radiusInput;
               String xcoordInput;
               String ycoordInput;
               int radius;
               int xcoord;
               int ycoord;
               public void actionPerformed(ActionEvent event)
               {
                   input = new JOptionPane();
                   radiusInput = input.showInputDialog("Radius?");
                   radius = Integer.parseInt(radiusInput);
                   xcoordInput = input.showInputDialog("X coordinate?");
                   ycoordInput = input.showInputDialog("Y coordinate?");
                   xcoord = Integer.parseInt(xcoordInput);
                   ycoord = Integer.parseInt(ycoordInput);
                   
                   component.drawCircle(radius, xcoord, ycoord);
                   component.repaint();
                   
                }
            };
          
       button1.addActionListener(listener);
       this.setSize(600, 600);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);    
    }
    
    
}

