import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class df here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Store
{
    private static ArrayList<Customer> list;
    public Store()
    {
        list = new ArrayList<Customer>();
    }
    public static void main(String args[])
    {
        String a;
        double b = 2;
        Scanner d = new Scanner(System.in);
        Store newStore = new Store();
        while(b != 0)
        {
            System.out.println("What is the customer's name?");
            a = d.next();
            System.out.println("What is the amount?");
            b = d.nextDouble();
            newStore.addSale(a,b);
        } 
        for(Customer i : list)
        {
            System.out.println(i.getName());
            System.out.println(i.getAmount());
        }
    }
    public void addSale(String customerName, double amount)
    {
        list.add(new Customer(customerName, amount));
    }
    public String nameOfBestCustomer()
    {
        
        return "";
    }
}
