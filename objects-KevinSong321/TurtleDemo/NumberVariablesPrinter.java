public class NumberVariablesPrinter
{
   public static void main(String[] args)
   {
       String greeting = new String( "Hello, World!" );
       int n = greeting.length();
       String river = new String( "Mississippi" );
       String bigRiver = river.toUpperCase();
       String test = new String("This is a test");
       String smallTest = test.toLowerCase();
       System.out.println(smallTest);
       // Replace "smallTestString" with the name you used for your lowercase string
       smallTest = new String( "whisper" );
       String bigTestString = smallTest.toUpperCase(); 
       
       System.out.println(bigTestString);
   }
}