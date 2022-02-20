

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VendingTest
{
    /**
     * Default constructor for test class VendingTest
     */
    public VendingTest()
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
    public void testfillUp()
    {
        Vending testVending = new Vending(10);
        testVending.fillUp(4);
        double amount = testVending.getCanCount();
        assertEquals(14, amount, 1e-6);
    }

    
    @Test
    public void testinput_tokens()
    {
        Vending testVending = new Vending();
        testVending.input_tokens(2);
        double amount = testVending.getTokenCount();
        double amount2 = testVending.getCanCount();
        assertEquals(2, amount, 1e-6);
        assertEquals(8, amount2, 1e-6);
    }
}
