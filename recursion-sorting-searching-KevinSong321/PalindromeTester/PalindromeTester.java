import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Demonstrates the use of nested while loops.
 * 
 * @author Lewis/Loftus/Cocking
 */
public class PalindromeTester
{
    /**
     * Tests strings to see if they are palindromes.
     *
     */
   public static void main (String[] args) throws FileNotFoundException
   {
      String str = "";
      int left, right;
      
      String fileName = "palindrome.txt";
      
      if(args.length > 0)
      {
          fileName = args[0];
        }
      // open the specified file for reading
      // throws an exception if not found
      File inputFile = new File(fileName);
      
      Scanner s = new Scanner(inputFile);
      // Make everything that isn't a letter, a delimiter
      s.useDelimiter("[^A-Za-z]+"); // Only looks for letters A-z
      // + means if more than one character
      
      //Read every token in the file and concatentate it
      while(s.hasNext())
      {
          str += s.next();
        }
        //Close the Scanner object to indicate we are done reading from the file
        s.close();
        
      // Make the entire string lowercase
      str = str.toLowerCase();
      System.out.println(str);
      
    
         System.out.println();
         if(isPalindrome(str))
         {System.out.println("Yis");}
         else
         {System.out.println("Nu");}
         
        
   }
   public static boolean isPalindrome(String str)
   {
       // terminating case
       if(str.length() <= 1)
       {
           return true;
        }
        
        if(str.substring(0,1).equals(str.substring(str.length()-1))){
            //recurse with a simpler version
            return isPalindrome(str.substring(1, str.length() -1));
        }
        else
        {
            return false;
        }
    }
}
