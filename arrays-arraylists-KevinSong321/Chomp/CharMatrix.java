// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    private int numrows;
    private int numcols;
    private char[][] array;
    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int rows, int cols)
    {
        numrows = rows;
        numcols = cols;
        array = new char[numrows][numcols];
        for(char[] i: array)
        {
            for(int j = 0; j < i.length; j ++)
            {
                i[j] = ' ';
            }
        }
    }

    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill  character
    public CharMatrix(int rows, int cols, char fill)
    {
        int[][] array = new int[numrows][numcols];
        for(int[] i: array)
        {
            for(int j = 0; j < i.length; j ++)
            {
                i[j] = fill;
            }
        }
    }

    // Returns the number of rows in grid
    public int numRows()
    {
        return numrows;
    }

    // Returns the number of columns in grid
    public int numCols()
    {
        return numcols;
    }

    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        char a =  array[row][col];
        return a;
    }

    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        for(int i = 0; i<row; i ++)
        {
            if(i == row)
            {
                for(int j = 0; j<row; j++)
                {
                    if(j == col)
                    {
                        array[i][j] = ch;
                        break;
                    }
                }
            }
        }
    }

    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        if(array[row][col] == ' ' )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Fills the given rectangle with fill  characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        for(int i = row0; i<row1; i ++)
        {
            for(int j = col0; j<col1; j++)
            {
                array[i][j] = fill;
            }
        }
    }

    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        for(int i = row0; i<row1; i ++)
        {
            for(int j = col0; j<col1; j++)
            {
                array[i][j] = ' ';
            }
        }
    }

    // Returns the count of all non-space characters in row 
    public int countInRow(int row)
    {return 0;}

    // Returns the count of all non-space characters in col 
    public int countInCol(int col)
    {
        return 0;
    }
}
