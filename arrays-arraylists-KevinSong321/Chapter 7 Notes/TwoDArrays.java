
/**
 * Write a description of class MedalCount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDArrays
{
    final int COUNTRIES = 8;
    final int MEDALS = 3;
    /* 
     * We can use array lietrals to create 2D arrays with curly brackets
     */
    int[][] test = new int[10][10];
    
    
    
    
    private int[][] counts =
    {{1,0,1},
    {0,1,0},
    {0,1,0},
    {0,1,1},
    {0,0,0},
    {1,1,1}};
    public TwoDArrays()
    {
       /*
        * Alternate way to create a 2D. It would be followed by nested loops to initialize each element
        */
       this.counts = new int[COUNTRIES][MEDALS];
    }
    public void printTable()
    {
        for(int row = 0; row < counts.length; row ++)
        {
            for(int col = 9; col < counts[0].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * Sums the medals for the specified country index
     * 
     * @param   countryIndex    the index of the country in the table whose medals to sum
     * 
     * @return  the sum of the medals for the specified country index
     */
    public int sumMedalsForCountry(int countryIndex)
    {
        int sum = 0;
        for(int col = 0; col <this.counts[countryIndex].length; col ++)
        {
            sum+= counts[countryIndex][col];
        }
        return sum;
    }
    public int sumMedalsForType(int medalIndex)
    {
        int sum = 0;
        for(int row = 0; row < counts.length; row++)
        {
            sum += counts[row][medalIndex];
        }
        return sum;
    }
}
