import java.util.Scanner;
/**
 * Kevin Song
 * 10-16-18
 */
public class Notes
{
    public static void ifExample()
    {
        // model a coin flip; 1 heads, 0 tails
        int coinFlip = (int)(Math.random()*2);
        /*
         * if statement
         *  Statements are executed if the conditional expression is true.
         *  Conditional expressions evalute to either true or false.
         *  The conditional expression must go inside a parentheses.
         *  Statements are grouped by blocks (curly bracket {}), not by indentation.
         *  There is no colon after the conditional expression.
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");  
        }
        /*
         * { } are not required for a single statement, though you should place them.
         * Leaving them out can lead to bugs 
         */
        if(coinFlip == 0)
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        /*
         * if-else statement
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        else
        {
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        }
        // model the roll of a four-sided die
        int dieRoll = (int)(Math.random()* 4) + 1;
        if (dieRoll == 1)
        {System.out.println("Rolled a 1");}
        else if (dieRoll==2)
        {System.out.println("Rolled a 2");}
        else if (dieRoll==3)
        {System.out.println("Rolled a 3");}
        else
        {System.out.println("Rolled a 4");}
    }
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * If we use the equality operator for doubles, it will only return true 
         *    if all binary match.
         * For "equal" numbers, this is pobably not the case due 
         *    to floating-point rounding, so we don't want this.
         * Instead, we will check if they are close enough (epsilon value).
         */
        final double EPSILON = 1e-14;
        if(Math.abs(num1-num2) < EPSILON)// abs - absolute value
        {
            return true;
        }
        else
        {
            return false;
        }
        // don't have to use an if statement
        // return(Math.abs(num1-num2)<EPSILON);
    }
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        if (str1==str2)                                                 
        {
            System.out.println("String references are equal");
        }
        else 
        {
            System.out.println("String references are not equal");
        }
        // This compares the two references, not the strings. Run-time error
        /*
         * The equals method returns true if the 2 objects referenced by the 
         *   variables are "equal". What equals means is defined by class.
         */
        if(str1.equals(str2)){System.out.println("Strings are equal");}
        else{System.out.println("Strings are not equal");}
        /*
         * We will determine which string comes first lexographically using
         *    the compareTo method of the String class.
         * compareTo returns an int:
         *    0: The 2 strings are equal sequentially
         *    <0:  Str1 < Str2 lexographically
         *    >0:  Str1 > Str2 lexographically
         */
        String firstStr = null;
        int result = str1.compareTo(str2);
        if(result <0)
        {
            firstStr = str1;
        }
        else if(result>0)
        {
            firstStr = str2;
        }
        if (firstStr != null){
        System.out.println("The first string is: " + firstStr);
        System.out.println("Its length is: " + firstStr.length());}
        else
        {System.out.println("Strings are equal");}
        /*
         * Logical Operators:
         *    NOT , !, highest precedence
         *    AND , &&, middle precedence
         *    OR , ||, lowest precedence
         */
        if (firstStr != null && firstStr.length() > 3)
        {
            //This is an example of a "short circuit".
            //If the left operand is false, the right operand will not process 
            System.out.println("The first string has more than 3 chars.");
        }
    }
    public static void shortCircuit()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your two favorite fruits: ");
        if(s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorites too!");
        }
        /*
         * This may result in a bug. If the first word entered is "kiwi", we will 
         *     never read the second word from the stream. You can fix this
         *     by assigning them to variables
         */
        System.out.println("Enter your favorite ice cream flavor: ");
        String flavor = s.next();
        System.out.println("Favorite ice cream flavor: " + flavor);
    }
    public static String getStudentClass(int gradeNumber)
    {
        /*
         * Switch statement
         * 
         * This is another conditional decision statement (like if)
         *   It is preferred when evaluating several discrete values.
         *   It supports byte, short, char, and int primitive types. It
         *   Also supports enumerations and String objects.
         *   
         * The condition is evaluated and then the flow of executione
         *   jumps to the case that matches.
         */
        String studentClass = "";
        switch(gradeNumber)
        {
            case 9:
            {
                studentClass= "freshman";
                /*
                 * break causes the flow of execution to leave the switch
                 * Without a break, the flow continues into the next case
                 */
                break;
            }
            case 10:
            {
                studentClass = "sophomore";
                break;
            }
            /*
             * By leaving out the break, multiple cases can run the same code
             */
            case 6:
            case 7:
            case 8:
            {
                studentClass = "junior high";
                break;
            }
            /*
             * default matches everything not matched by a case
             */
            default:
            {
                studentClass = "elementary";
            }
        }
        return studentClass;
    }
    public static void extraOperatorsExample()
    {
        /*
         * augmented assignment operators: +=, -=, *=, /=, %= 
         */
        int x = 7; int y = 7; int z = 7;
        x = x + 1;
        y += 1;
        z++; z--;
        System.out.println(" x|y|z " + x + y + z);
        /*
         * post increment/decrement (++/--)
         *      These are equivalent to adding/subtracting 1
         *      These return the value before performing the increment 
         */
        x = 7;
        y = x++;
        System.out.println(" X|Y " + x + y); // x = 8, y = 7
        /*
         * pre increment/decrement operators (++/--)
         *      These return the value after performing the increment
         */
        x = 7;
        y = ++x;
        System.out.println(" X|Y " + x + y); // x = 8, y = 8
    }
}
