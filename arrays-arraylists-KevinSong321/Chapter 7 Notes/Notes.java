import java.util.GregorianCalendar;
/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes
{
    public static void createArryOfEvens()
    {
        /*
         * An array is an ordered collection of elements of the same type. The type can be a primitive, or a class (e.g., Turtle).
         * 
         * An array variable is like an object variable in that it must be declared and initialized.
         * 
         * Lexographic
         * All values are initialized to their default (int to 0, classes to null) 
         */
        int[] evens = new int[10];  // Holds 10 elements
        /*
         * Set the value of each element in the arry to the first 10 positive even integers.  (Length is used to query the number of elements,it is NOT a method.
         * Brackets are used to reference specific element in the array based off its index.
         */
        for(int i = 0; i < evens.length; i ++)
        {
            evens[i]= (i+1) *2;
        }
        System.out.println(evens); // This prints the reference
        //Print the array
        for(int i = 0; i < evens.length; i ++)
        {
            System.out.println(i + " : " + evens[i]);
        }
    }
    public static void createArrayOfOdds()
    {
        /*
         * An array literalhas curly brackets and comma separated values can be used to initialize the array but only when declared. 
         */
        int[] odds = {1,3,5,7,9,11,13,15,17,19,21};
       
        for(int i = 0; i < odds.length; i ++)
        {
            System.out.println(i + ":" + odds[i]);
            /*
             * Bounds error
             * Arrays have a fixed size once initialized.
             * The Index specificed must refer to a valid element.
             * Otherwise, an ArrayIndexOutOfBounds eception is generated.
             */
        }
        int[] moreOdds = odds;
        odds[2]= 6;
        System.out.println(moreOdds[2]);
        /*
         * Array references
         * 
         * Variables of type array, contain a reference to the array stored in the memory.
         * Assigning one array value to another copies the reference, not the elements.
         */
        /*
         * Ennhanced for loop
         * 
         * Similar to the for i in structurte in python
         * Iterates over the elements in an array
         * 
         * The variable must be the same type as the elements
         */
        for(int element : odds)
        {
            System.out.println(element);
        }
        for(int element: odds)
        { element += 1;}
        for (int element : odds)
        { System.out.println(element);} //These for loops do not do anything as element is a local variable that is only copying the values
        
    }
    public static void createArrayOfCalendars()
    {
        /*
         * Create an array of 12 calenars, each one initialized to the start of the month
         * 
         * When we create an array of objects, each object is initialized to null. 
         */
        GregorianCalendar[] calendars = new GregorianCalendar[12];
        for(GregorianCalendar i : calendars)
        {System.out.println(i);}
        for(int i = 0; i < calendars.length; i ++)
        {
            calendars[i] = new GregorianCalendar(2018, i + 1, 1);
        }
        for(GregorianCalendar i : calendars)
        {System.out.println(i);}
        /*
         * An enhanced for loop cannot modify the values of the elements in the array. But we can call mutator methods. 
         */
        for(GregorianCalendar i : calendars)
        {
            i.add(GregorianCalendar.DAY_OF_MONTH, 2);
        }
         for(GregorianCalendar i : calendars)
        {System.out.println(i);}
    }
    
}
