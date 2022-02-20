import java.util.Scanner;

/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by '_'. For example, "The inventor of Java was _James Gosling_."
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question // subclass of Question class
{
    /*
     * Do not declare instance variables for text and answer (They are from Question)
     */
    /**
     * This method overrides the setText method in the Question class
     * 
     * Sets the question text.
     * 
     * @param   questionText    the text of the question, including the answer
     */
    @Override //Use this annotation when overriding a method to help the compiler verify that you are overriding and not overloading
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_"); // Replaces whitespace
        String question = parser.next();
        String answer = parser.next();
        /*
         * The inherited instance variables are private. We must use the mutator and accessor methods
         * text = question; does not work
         */
        /*
         * Use the "super" reserved word to call the setText method as defined in teh superclass (parent)
         */
        super.setText(question);
        
        
    }
}
