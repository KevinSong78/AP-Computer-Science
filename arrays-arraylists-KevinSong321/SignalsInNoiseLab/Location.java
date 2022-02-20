/**
 * Location class for objects in the radar grid
 * 
 * @author Kevin Song
 * @version 12-17-18
 */
public class Location
{
    int row;
    int col;
     /**
     * Constructor for objects of class Location
     * 
     * @param   rows    the row position of the object
     * @param   cols    the column position of the object
     */
    public Location(int irow, int icol)
    {
        row = irow;
        col = icol;
    }
    /**
     * Returns the row position of the object
     * 
     * @return the row position of the object
     */
    public int getRow()
    {
        return row; 
    }
    /**
     * Returns the column position of the object
     * 
     * @return the column position of the object
     */
    public int getCol()
    {
        return col;
    }
    
}