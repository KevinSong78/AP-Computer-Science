
import java.awt.Rectangle;

public class RectanglePrinter
{
   public static void main(String[] args)
 
   {
     
       Rectangle r1 = new Rectangle(0, 0, 100, 50);
      /* Your code goes here */ 
      r1.grow(10,20); 
      Rectangle r2 = r1;
      
      
 
      

      Rectangle box = new Rectangle(5, 10, 20, 30); box.add(4, 4); 
      System.out.println(box);
   }
}