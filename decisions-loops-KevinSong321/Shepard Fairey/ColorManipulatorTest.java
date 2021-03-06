

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
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
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void toTestgrayscale()
    {
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator(picture);
        Pixel testpicture;
  
        manipulator.grayscale();
        picture.explore();
        testpicture = picture.getPixel(10,20);
        assertEquals(testpicture.getRed(),128 , 0.01);
    }
}
