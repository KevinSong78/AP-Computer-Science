
public class Nested_loops
{
    public static void forLoops()
    {
        for(int i = 1; i <= 2; i ++)
        {
            for(int j = 1; j <= 4; j ++)
            {
                System.out.println("" + i + " " + j); 
            }
        }
    }
    public static void whileLoop()
    {
        int i = 1;
        while(i <= 2)
        {
            int j = 1;
            while(j <=4)
            {
                System.out.println("" + i + " " + j);
                j ++;
            }
            i ++;
        }
    }
    public static void doLoop()
    {
        int i = 1;
        do
        {
            int j = 1;
            do
            {
                System.out.println("" + i + " " + j);
                j ++;
            }
            while(j <= 4);
            i ++;
        }
        while(i <= 2);
    }
}