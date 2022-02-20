import java.util.*; // Imports everything in java.util
import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @author gcschmit
 * @version 5 December 2017
 */
public class ArrayListNotes
{
    public static void main(String[] args){
        /*
         * The ArrayList class is a java Generic.
         * 
         * We have to specify the type of the elements in the list in angle brackets
         * 
         * Primitives are not classes and cannot be specified as the type of elements.
         * Instead we use the corresponding Wrapper class
         * 
         */ 
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList = createRandomIntegerList(10,20);
        System.out.println(myList);
        removeEvens(myList);
        System.out.println(myList);
    }
    /**
     * Creates and returns an ArrayList of the specified number of Integers where each element is assigned a random varible between 1 and range.
     * 
     * @param size the number of Integers to add to the list
     * @param range the range of random values to assign to each element
     * @return the newly created and initialized list
     */
    public static ArrayList<Integer> createRandomIntegerList(int size, int range)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <size; i++)
        {
           int value = (int)(range * Math.random()) + 1;   // Multiply by the upper bound you want and add for the lower bound (Inclusive then exclusive)
           list.add(value); // The add method adds the specified object to the end of the list.   
                             // Autoboxing: Primitives are automatically converted to their corresponding wrapper class. However, type promotion does not occur
        }
        return list;
    }
    /**
     * Removes even numbers from the specified list
     * 
     * @param list the list of numbers to potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
       /*
        * The size method returns the numbers of elements in the list.
        */
       int listSize = list.size(); //.size() instead of .length, also .size() 
       for(int i = 0; i < list.size(); i ++)
       {
           // The get method returns the element at the specified index.
           if(list.get(i) % 2 == 0)
           {
               list.remove(i); // The remove method deletes the element at the specified index.
               i--;
           }
       }
    }
    public static void removeEvens2(ArrayList<Integer> list)
    {
        for(int i = list.size()-1; i >= 0; i --)
        {
            if(list.get(i)%2 ==0)
            {
                list.remove(i);
            }
        }
    }

}