
public class Event
{
    private int days;
    private String name;
    public static void main(String[] args)
    {
        System.out.println((Math.random()+1)*2);
    }
    public Event(String initName, int initDays)
    {
        this.name = initName;
        this.days = initDays;
    }
    
    public String getName()
    {
        return this.name;
    }
    public int getDays()
    {
        return this.days;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void changeDays(int newDays)
    {
        this.days = newDays;
    }

    public String toString()
    {
        int weeks = days/7;
        days %= 7;
        String toString = ("The event: " + name + " will occur in " + days + 
            " days and " + weeks + " weeks.");
        return toString;
    }
    
    
   
    
}