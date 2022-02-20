
/**
 * Write a description of class ATMCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATMCard extends Card
{
    private String cardNumber;
    private String PIN;
    
    public ATMCard(String n, String cardNum, String pin)
    {
        super(n);
        cardNumber = cardNum;
        PIN = pin;
    }
    
    public String toString()
    {
        String string = (super.toString() + ", card number: " + cardNumber + ", PIN: " + PIN);
        
        return string;
    }
}
