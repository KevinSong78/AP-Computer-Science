import java.awt.Color;

public class TurtleDemo
{
    public static void makeAwesomeTurtlePattern()
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.RED);
        crush.penDown();
        crush.forward(50);
        crush.setWidth(150);
        crush.setHeight(150);
        crush.setPenWidth(10);
        crush.forward(50);
        crush.forward(100);
        
    }
    
    public static void chapter2Notes()
    {
        /*
         * Objects are entities in a program
         *   Objects have properties (attributes).
         *   Objects are manipulated by invoking methods.
         *   
         *  ocean and crush reference objects
         *  
         * Classes describe a collection of objects
         *     All objects of a class have the same behavior (methods),
         *       and they have the same types of properties 
         *       but may have different values.
         *       
         * World and Turtle are classes
         */
        World ocean = new World();
        
        /* 
         * We use the new operator to construct an object.
         * The class of the object is specified immediately after the new operator 
         *    (e.g., Turtle)
         * If we have to pass additional information to create the object,
         *   arguments are specified in parentheses after the class (e.g., ocean).
         */
        Turtle crush = new Turtle(ocean);
        
        /*
         * Variable store values to be used later.
         * Variables have a type, name, and a value
         */
        int width;  // Declaring and then assigning
        width = 20; // or just int width = 20;
        
        /*
         * Primitive variables only store a value and not references (attributes).
         * char stores a single character
         */
        
        /*
         * When invoking methods, we use the dot operator to invoke a method
         *   on an object.
         * Some methods take no arguments, but still have parentheses like penDown
         * 
         * Some methods take 1 or more arguments like forward
         * 
         * Mutator methods moidfy the state of the objects, like penDown,forward
         */
        
        /*
         * Accessor methods return a property of the object
         */
        
        /*
         * Some functions (like .replace) to not change the variable, you need
         *   a new variable
         */
        int penWidth = crush.getPenWidth();
        
    }
}
