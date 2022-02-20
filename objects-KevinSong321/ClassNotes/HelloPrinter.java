/**
 * Kevin Song
 * 8-21-18
 * Every Java program contains one or more class (e.g., HelloPrinter)
 * 
 * In general, every source file (e.g., HelloPrinter.java) contains one
 *      class (e.g., HelloPrinter).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 * 
 */
public class HelloPrinter
{
    /*
     * A class contains methods
     * 
     * Most Java applications contain a class with a main method.
     * 
     * The main method is executed when the application starts.
     */
    public static void main(String[] args)
    {
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., println).
         * 
         * In general, methods are invoked on objects (e.g., System.out)
         * 
         * When invoking a method, arguments are passed in parentheses
         *     (e.g., "Hello, World!").
         */

        System.out.println("Hello, World!");// comment at the end of the line
        
        // this is a single line comment
        /* 
         * Identifiers are any combination of:
         *    letters
         *   digits (but not as the first character)
         *   underscores
         *   dollar signs
         *   
         *   These are valid identifiers:
         */
        int y, x2, x_y, x$;
        //This is not a valid identifier
        //int 2y;
        
        /*
         * Identifiers are case sensitive
         * 
         * By convention, constats are all uppercase.
         *    Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 3000000;
        
        /*
         * By convention, most other identifiers start with a lowercase 
         *     letter. Subsequent words start with an uppercase letter.
         *     CamelCase
         *     
         * Classes start with an uppercase.
         */
        String firstName;
        
        /*
         * Compile time error. (This code doesn't even compile)
         * Often called syntax errors
         * 
         * System.ou.println("Hello, World!");
         */
        
        //System.out.println(1/0);
        
        /*
         * This is a run time error, an exception is generated
         */
        //System.out.println( 1 / 0 );
        
        /* 
         * Other run time errors produce the wrong output
         */
    }
}

