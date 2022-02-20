import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      //ArrayList<Integer> tempList = null;
      ArrayList<Integer> tempList = null;
      if (n <= 0)  // The smallest list we can make
      {
          ArrayList<Integer> list=  new ArrayList<Integer>();
          return list;


      }
      else        // All other size lists are created here
      {
          
          tempList = ListMethods.makeList(n-1);
          tempList.add(n);
          //tempList.add(0,n);

      }
      return tempList;
   }
}