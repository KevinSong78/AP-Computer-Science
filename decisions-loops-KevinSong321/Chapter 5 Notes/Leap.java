import java.util.Scanner;

public class Leap
{
    
    public static double isLeapYear()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year");
        double year = s.nextInt();
        if(year%4 == 0 && year%100 != 0 || year%400 ==0)
        {
            System.out.println("This year is a leap year!");
        }
        else
        {
            System.out.println("This year is not a leap year.");
        }
        return year;
    }
    public String toString()
    {
        double year = isLeapYear();
        
        String toString = "" + year;
        System.out.println(toString);
        return toString;
    }
}
