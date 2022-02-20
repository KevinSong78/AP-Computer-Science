import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class aButtonViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ButtonViewer
{
   private final int FRAME_WIDTH = 400;
   private final int FRAME_HEIGHT = 100;
   
   
   private JFrame frame;
   private JPanel panel;
   private JLabel label;
   private JButton buttonA;
   private JButton buttonB;
   
   private int clickCountA;
   private int clickCountB;
   public ButtonViewer()
   {
       this.clickCountA = 0;
       this.clickCountB = 0;
       // 1. Define and setup the UI components
       this.frame = new JFrame();
       this.panel = new JPanel();
       this.label = new JLabel("The button was clicked " + this.clickCountA + " times " + clickCountB + " times");
       this.panel.add(label);
       
       this.buttonA = new JButton("click me");
       this.panel.add(buttonA);
       
       this.buttonB = new JButton("click me");
       this.panel.add(buttonB);
       
       this.frame.add(panel);
       // 2. Create Listener object
       ActionListener listener = new ActionListener() // Anon class
           {
               public void actionPerformed(ActionEvent event)
               {
                  if(event.getSource() == buttonA)
                     {
                        clickCountA++;
                     }
                  else if(event.getSource() == buttonB)
                     {
                        clickCountB++;
                     }
                  label.setText("The button was clicked " + clickCountA + " times " + clickCountB + " times");
               }
           };
       
       // 3. Register listener object with componenet that generates events
       buttonA.addActionListener(listener);
       buttonB.addActionListener(listener);
       // Configure the frame and show it
       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       
    }
   public static void main(String[] args)
   {
       ButtonViewer viewer = new ButtonViewer();
    }
    
   public class ClickListener implements ActionListener
   {
       public void actionPerformed(ActionEvent event)
       {
           if(event.getSource() == buttonA)
           {
               clickCountA++;
            }
            else if(event.getSource() == buttonB)
            {
                clickCountB++;
            }
           label.setText("The button was clicked " + clickCountA + " times " + clickCountB + " times");
        }
    
   }
}

