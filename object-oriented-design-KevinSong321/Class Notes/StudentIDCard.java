
/**
 * Write a description of class StudentIDCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentIDCard extends Card
{
    // instance variables - replace the example below with your own
    private String IDnumber;

    public StudentIDCard(String n, String id)
    {
       super(n);
       IDnumber = id;
    }
    public String toString()
    {
        String string = (super.toString() + ", ID number: " + IDnumber);
        
        return string;
    }
}
