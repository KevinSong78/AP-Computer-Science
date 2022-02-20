
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wallet
{
    private Card card1;
    private Card card2;
    
    public Wallet(Card cardOne, Card cardTwo)
    {
        card1 = cardOne;
        card2 = cardTwo;
    }
    public void addCard(Card card)
    {
        if(card1 == null)
        {
            card1 = card;
        }
        else if(card2 == null)
        {
            card2 = card;
        }
    }
    public int getExpiredCardCount()
    {
        int count = 0;
        if(card1.isExpired() == true){
            count +=1;
        }
        if(card2.isExpired() == true){
            count+= 1;
        }
        return count;
    }
    public String toString()
   {
       String string = (card1.toString() + "|" + card2.toString());
       
       return string;
   }
}
