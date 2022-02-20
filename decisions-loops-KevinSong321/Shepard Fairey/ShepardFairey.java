import java.awt.Color;

/**
 * Transforms a picture by applying a Shepard Fairey-inspired effect.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShepardFairey
{
    private ColorManipulator manipulator;
    private Picture picture2;
    private static final Color NEON_GREEN = new Color( 205, 229, 1 );
    private static final Color BLUE = new Color( 7, 108, 147 );
    private static final Color ORANGE = new Color( 237, 132, 0 );
    private static final Color PURPLE = new Color( 128, 5, 154 );
    private double a,b,c,d;
    public ShepardFairey( Picture newPicture )
    {
        this.manipulator = new ColorManipulator( newPicture );
        picture2 = newPicture;
    }

    /**
     * Transforms the picture by applying a Shepard Fairey-inspired effect.
     *
     */
    public void transform()
    {
        manipulator.grayscale();
        int width = this.picture2.getWidth();
        int height = this.picture2.getHeight();
        int max= 0;
        int min= 255;
        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture2.getPixel( x, y );
                if(pixel.getBlue() > max)
                {
                    max = pixel.getBlue();
                }
                if(pixel.getBlue() < min)
                {
                    min = pixel.getBlue();
                }
            }
        }
        double range = max - min;
        a = range / 4;
        b = range / 2;
        c = 3 * range / 4;
        d = range;
        manipulator.posterize(NEON_GREEN, BLUE, ORANGE, PURPLE,
        a,b,c,d);
    }
    
    
    public static void main(String args[])
    {
        // create a new picture object based on the original selfie
        //  (the selfie image must be in the Shepard Fairey folder)
        Picture selfie = new Picture( "selfiePortrait.jpg" );
       
        // create a ShepardFairey object to transform the selfie picture
        ShepardFairey fairey = new ShepardFairey( selfie );

        // display the original selfie picture
        selfie.explore();

        // transform the selfie picture by applying a Shepard Fairey-inspired effect
        
        fairey.transform();
        selfie.explore();
        
        // save the transformed code
       
        selfie.write( "C:\\Users\\ksong\\decisions-loops\\Shepard Fairey\\KevinPortrait.jpg" );
        selfie.write( "C:\\Users\\Alice\\Documents\\GitHub\\decisions-loops-KevinSong321\\Shepard Fairey\\KevinPortrait.jpg");
        // repeat the steps for the selfie in landscape orientation
        selfie = new Picture( "selfieLandscape.jpg" );
        fairey = new ShepardFairey( selfie );
        selfie.explore();
        fairey.transform();
        selfie.write( "C:\\Users\\ksong\\decisions-loops\\Shepard Fairey\\KevinLandscape.jpg" );
        selfie.write( "C:\\Users\\Alice\\Documents\\GitHub\\decisions-loops-KevinSong321\\Shepard Fairey\\KevinLandscape.jpg");
        // display the transformed selfie picture
        selfie.explore();
        
    }
}