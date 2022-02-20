import java.util.Random;

public class RandomDemo
{ 
   public static void main(String[] args)
   { 
    Random dieSimulator = new Random();
    int die;
    
    
    
    
    die = dieSimulator.nextInt(6) + 1;
    System.out.println(die);
    
    
   
   }
    
    
}