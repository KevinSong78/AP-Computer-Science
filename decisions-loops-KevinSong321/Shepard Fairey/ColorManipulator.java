import java.awt.Color;

/**
 * Class that manipulates the colors in a specified picture
 *
 * @author gcschmit
 * @version 5 June 2017
 */
public class ColorManipulator
{
    private Picture picture;

    /**
     * Constructs a new ColorManipulator object with the specified picture
     *
     * @param  newPicture  the picture to manipulate
     */
    public ColorManipulator( Picture newPicture )
    {
        this.picture = newPicture;
    }

    /**
     * Sets the blue component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxBlue()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setBlue( 255 );
            }
        }
    }
    public void maxRed()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setRed( 255 );
            }
        }
    }
    public void maxGreen()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setGreen( 255 );
            }
        }
    }

    /**
     * Negates the color of every pixel in the picture
     *      An example of manipulating the color of a pixel using a Color object
     */
    public void negate()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int negatedRed = 255 - color.getRed();
                int negatedBlue = 255 - color.getBlue();
                int negatedGreen = 255 - color.getGreen();
                
                Color negated = new Color( negatedRed, negatedBlue, negatedGreen );
                pixel.setColor( negated );
            }
        }
    }
    public void grayscale()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
        int graying;
        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                graying = (pixel.getRed() + pixel.getBlue() + 
                    pixel.getGreen())/3; 
                pixel.setGreen( graying );
                pixel.setRed( graying );
                pixel.setBlue( graying );
            }
        }
        
    }
    
    public void posterize(Color NEON_GREEN, Color BLUE, Color ORANGE, Color PURPLE,
    double a,double b,double c,double d)
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
        int coloring;
        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                coloring = (pixel.getRed() + pixel.getBlue() + 
                    pixel.getGreen())/3; 
                if(coloring <= a)
                {
                    pixel.setColor( PURPLE );
                }
                else if(coloring <= b)
                {
                    pixel.setColor( BLUE);
                }
                else if(coloring <= c)
                {
                    pixel.setColor( ORANGE);
                }
                else
                {
                    pixel.setColor(NEON_GREEN);
                }
            }
        }
    }
    public static void main(String args[])
    {
        // the selfie image must be in the Shepard Fairey folder
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.grayscale();
        picture.explore();
        System.out.println(picture.getPixel(10,20));
        
    }
}
