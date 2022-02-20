
/**
 * Write a description of class WalletTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalletTest extends Card
{
    /**
     * Constructor for objects of class WalletTest
     */
     public WalletTest(Card cardOne, Card cardTwo)
     {
        }
 // This is polymorphism as the toString method returns specialized behavior according to the class of the card n (As they could be different types of cards
      public static void main(String[] args)
    {
        Wallet wallet = new Wallet(null, null);
        Card n = new ATMCard("Lev", "324594", "0392");
        Card nn = new DriverLicense("Kev", 3028);
        wallet.addCard(n);
        wallet.addCard(nn);
        wallet.toString();
        wallet.getExpiredCardCount();
        System.out.println(wallet.getExpiredCardCount());
    }
}
