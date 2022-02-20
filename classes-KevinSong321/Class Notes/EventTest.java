

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
/**
 * The test class EventTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EventTest
{
    /**
     * Default constructor for test class EventTest
     */
    public EventTest()
    {
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void event()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the name of the event: ?");
        String name = s.next();
        System.out.println("How many days until the event: ?");
        int days = s.nextInt();
        Event concert = new Event(name, days);
        System.out.println(concert.toString());
        
        System.out.println("What is the new amount of days until event: ?");
        int newDays = s.nextInt();
        concert.changeDays(newDays);
        System.out.println(concert.toString());
    }
    
}
