import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * tchild constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  public void keepOnlyBlue()
  {
       Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
    }
    public void keepOnlyGreen()
  {
       Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed(0);
      }
    }
    }
    public void keepOnlyRed()
  {
       Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setBlue(0);
      }
    }
    }
  public void negate()
  {
      Pixel[][] pixels = getPixels2D();
      for(Pixel[] rowArray : pixels)
      {
          for (Pixel pixely : rowArray)
          {
              pixely.setGreen(255 - pixely.getGreen());
              pixely.setBlue(255-pixely.getBlue());
              pixely.setRed(255-pixely.getRed());
            }
        }
    }
  public void grayscale()
  {
      Pixel[][] pixels = getPixels2D();
      int average = 0;
      for(Pixel[] rowArray : pixels)
      {
          for (Pixel pixely : rowArray)
          {
              average = pixely.getBlue() + pixely.getRed() + pixely.getGreen();
              
              pixely.setGreen(255 - average);
              pixely.setBlue(255-average);
              pixely.setRed(255-average);
            }
        }
    }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels.length;
    
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < pixels.length/2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[width - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels.length;
    
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < pixels.length/2; row++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[width - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels.length;
    
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < row; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[col][row];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  public void mirrorGull()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    int i = 0;
    for (int row = 200; row < pixels.length-150; row++)
    {
      for (int col = 200; col < width-250; col++)
      {
        
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][ width - col + 199];
        rightPixel.setColor(leftPixel.getColor());
      }
      
    } 
    }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  public void mirrorArms()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = 224;
    for (int row = 0; row < 29; row++)
    {
      for (int col = 0; col < 90; col++)
      {
         topPixel = pixels[row+168][col+224];
         bottomPixel = pixels[width-row][col+224];
         bottomPixel.setColor(topPixel.getColor());
      }
    } 
    width = 228; 
    for (int row = 0; row < 50; row++)
    {
      for (int col = 0; col < 70; col++)
      {
         topPixel = pixels[row+155][col+104];
         bottomPixel = pixels[width-row][col+104];
         bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  public void cropAndCopy( Picture sourcePicture, int startSourceRow, int endSourceRow,
  int startSourceCol, int endSourceCol, int startDestRow, int startDestCol )
  {
      Pixel[][] picture = this.getPixels2D();
      Pixel[][] originalPicture = sourcePicture.getPixels2D();
      int xposition = startDestRow;
      int yposition = startDestCol;
      for (int i = startSourceRow; i < endSourceRow; i++)
      {
          yposition = startDestCol;
          for(int j = startSourceCol; j < endSourceCol; j++)
          {
             picture[xposition][yposition].setColor(originalPicture[i][j].getColor());
             yposition ++;
            }
          
          xposition++;
        }
    }
  public static void collage(Picture duality,Picture duality2,Picture duality3,Picture duality4)
    {  
    duality2.negate();
    
    duality3.mirrorHorizontal();
    duality3.mirrorVertical();
    
    duality4.grayscale();

    }
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
      
  }
  
} // this } is the end of class Picture, put all new methods before this
