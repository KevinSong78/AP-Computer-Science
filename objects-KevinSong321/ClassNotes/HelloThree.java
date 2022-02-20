
/**
 * Write a description of class HelloThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HelloThree

{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL( "http://www.stickpng.com/assets/images/5845e614fb0b0755fa99d7e8.png");
      JOptionPane.showMessageDialog(null, "Much", "Wow Title", JOptionPane.PLAIN_MESSAGE,
            new ImageIcon(imageLocation));
   }
}