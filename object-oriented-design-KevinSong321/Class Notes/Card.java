
public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }
   public boolean isEquals()
   {
       return false;
    }
   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {       
      return false;
   }

   public String toString()
   {
      return "Card holder: " + name;
   }
}