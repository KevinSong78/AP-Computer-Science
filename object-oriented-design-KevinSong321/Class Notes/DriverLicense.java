import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * Write a description of class DriverLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private int expiration;
    
    public DriverLicense(String n, int year)
    {
        super(n);
        expiration = year;
    }
    public int getExpiration()
    {
        return expiration;
    }
    public static void main(String[] args)
    {GregorianCalendar calendar = new GregorianCalendar();
        
        System.out.println(calendar.get(Calendar.YEAR));
        
    }
    public boolean isExpired()
    {GregorianCalendar calendar = new GregorianCalendar();;
        if(expiration > calendar.get(Calendar.YEAR))
        {
            return true;
        }
        return false;
    }
    
    public String toString()
    {
        String string = (super.toString() + ", expiration year: " + expiration);
        
        return string;
    }
}
