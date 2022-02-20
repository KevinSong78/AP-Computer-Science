
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
   public String name;
   public double amount;
   public Customer(String name, double amount)
   {
       this.name = name;
       this.amount = amount;
   }
   public String getName()
   {
       return name;
   }
   public double getAmount()
   {
       return amount;
    }
}
