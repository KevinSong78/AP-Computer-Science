
/**
 * Write a description of class f here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       
       System.out.println(names.get(0));
       System.out.println(names.get(names.size()-1));
       
       System.out.println(names.size());
       names.set(names.indexOf("Alice"), "Alice B. Toklas");
       
       names.add(names.indexOf("David")+1, "Doug");
       System.out.println(names);
       
       for(String i : names)
       {
           System.out.println(i);
       }
       
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);

       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
       /*
        * ArrayList is a list of references, deleting  one from names does not remove it from names2
        */
   }
} 