import java.util.Scanner;
public class Notes
{
    public static void whileExample()
    {
        /* while loop:
         *      evaluates a boolean expressiono 
         *      if true, executes the body and then re-evaluates
         *      if false, skips the body and continues 
         */
        int count = 1;               // initialization
        while(count <= 5)            // condition
        {
           System.out.println(count);// body
           count++;                  // update the condition variable
        }
        System.out.println("Done");
    }
    public static void whileExample2()
    {
        int count = 1;
        //Infinite loop
        while(count!= 50)
        {
            System.out.println(count);
            count += 2;
        }
    }
    public static void forExample()
    {
        /* for loop:
         * 
         * Three parts of the for loop statement:
         *      1. initialization - executed once
         *      2. boolean expression - evaluated at the start of
         *         eatch iteration
         *      3. update the condition variable - executed at the 
         *         end of each iteration before evaluating again 
         */
        for(int count = 1;                      //Initialization
                count <= 5;                     //boolean expression
                count ++)                       //Update condition
                {
                    System.out.println(count);  //body
                }
        System.out.println("done");
    }
    public static void offByOne()
    {
        /* The infamous off-by-one error is common with for loops 
         *      executing one too many or one too few times
         * Carefully ask: should the initial value start at 0 or 1?
         * Should the condition be < or <= ? 
         */
        //We want to print five "*"
        for(int x = 0;
            x <= 5; // Should be x < 5
            x ++)
            {
                System.out.println("*");
            }   
    }
    public static void doExample()
    {
        /* do loop (do-while loop):
         * 1. Executes the body of the loop
         * 2. Evaluates the condition expression
         *      if true, executes the body of the loop again
         *      if false, continues execution after the loop */
        int count = 1;
        do
        { System.out.println(count);
            count ++;
        }
        while(count<= 5);
    }
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int value;
        do{
            System.out.println("Enter a integer (-1 to exit): ");
            /* Sentinel Value
             *      value (e.g., -1) used to terminate a loop
             *      it is often entered by a user */
             value = s.nextInt();
             if (value == -1)
             {break;}
             sum += value;
        }
        while(value != -1);
        return sum;
    }
    public static int sum2()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int value = 0;
        do{
            System.out.println("Enter a integer (-1 to exit): ");
            /* The hasNextInt method of the scanner returns true if 
             *      the next token read is an integer. It does not 
             *      consume that token. If there are no tokens in the
             *      stream, it waits until there are. */
            if(s.hasNextInt() == false)
            {   System.out.println("\"" + s.next() +
            "\" is not an integer; try again.");
            /* continue:
             *      1. immediately skips to the end of the inner-most
             *      loop it is in
             *      2. re-evaluates the loop condition */
             continue;
            }
            value = s.nextInt();
            if (value == -1){ break;}
            sum += value;
        }
        while(value != -1);
        return sum;
    }
}