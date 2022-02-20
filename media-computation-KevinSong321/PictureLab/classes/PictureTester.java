/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
    }
  public static void testNEGATe()
  {
      Picture motorbike = new Picture("redMotorcycle.jpg");
      motorbike.explore();
      motorbike.negate();
      motorbike.explore();
    }
  public static void testgayscale()
  {
      Picture download = new Picture("download.jpg");
      download.explore();
      download.grayscale();
      download.explore();
    }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorional()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorionalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorDiag()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  public static void testSnowman()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore();
    }
  public static void testGull()
  {
      Picture gull = new Picture("seagull.jpg");
      gull.explore();
      gull.mirrorGull();
      gull.explore();
    }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testCollage()
  {
      Picture canvas = new Picture(600,960);
      Picture duality = new Picture("wallpaper.jpg"); 
      Picture duality2 = new Picture("wallpaper.jpg");
      Picture duality3 = new Picture("wallpaper.jpg");
      Picture duality4 = new Picture("wallpaper.jpg");
      
      canvas.collage(duality,duality2,duality3,duality4);
      
      canvas.cropAndCopy(duality, 0, 300, 0, 480, 0, 0);
      canvas.cropAndCopy(duality2, 0, 300, 0, 480, 300, 0);
      canvas.cropAndCopy(duality3, 0, 300, 0, 480, 0, 480);
      canvas.cropAndCopy(duality4, 0, 300, 0, 480, 300, 480);
      
      canvas.explore();
      canvas.write("KevinSong.jpg");
    }
    public static void testCropAndCopy()
  {
      Picture beach = new Picture("beach.jpg");
      Picture sourcePicture = new Picture("snowman.jpg");
      beach.explore();
      beach.cropAndCopy( sourcePicture, 10, 50, 10, 50, 50, 50 );
      beach.explore();
    }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}