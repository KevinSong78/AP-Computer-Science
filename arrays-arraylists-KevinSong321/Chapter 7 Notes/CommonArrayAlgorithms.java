import java.util.Arrays;

public class CommonArrayAlgorithms
{
    /**
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }
        return randomArray;
    }
    /**
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }
    /**
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int element : array)
        {
            sum += element;
        }
        average = sum / array.length;
        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }
    /**
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] array = createRandomArray( 10, 50 );
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if (i < array.length - 1)
            {
                System.out.print("|");
            }
        }
    }
    /**
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index
     */
    public static void linearSearch( int valueToFind )
    {
        int index = -1;
        int[] array = createRandomArray(25, 10);
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == valueToFind)
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            System.out.println("Value is not in the array.");
            printArray(array);
        }
        else
        {
            System.out.println("First index value of the element is " + index);
            printArray(array);
        }
    }
    /**
     * Array Algorithm #4: Swap Elements
     *  creates an array filled with random numbers
     *  prints the array
     *  swaps the elements at the two specified indexes
     *  prints the array
     */
    public static void swapElements( int index1, int index2 )
    {
        int[] array = createRandomArray( 10, 50 );
        printArray(array);

        int num1 = array[index1];
        array[index1] = array[index2];
        array[index2] = num1;

        printArray(array);
    }
    /**
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int[] array = createRandomArray(10,50);
        int max = array[0];
        for(int element : array)
        {
            if(element > max)
            {
                max = element;
            }
        }
        System.out.println(max);
        printArray(array);
    }
    /**
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
        int[] array = createRandomArray(10,50);
        int min = array[0];
        for(int element : array)
        {
            if(element < min)
            {
                min = element;
            }
        }
        System.out.println(min);
        printArray(array);
    }
    /**
     * Array Algorithm #6: Copying Arrays
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] copyArray()
    {
        int[] array1 = createRandomArray( 10, 50 );
        int[] array2 = new int[array1.length];
        int count = 0;
        for (int i = array1.length; i > 0; i--)
        {
            int x = array1[i-1];
            array2[count] = x;
            count++;
        } 
        printArray(array1);
        printArray(array2);
        return array2;
    }
}