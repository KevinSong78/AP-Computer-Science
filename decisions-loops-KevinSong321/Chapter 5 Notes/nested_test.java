import java.util.Scanner;
public class nested_test
{
    public static void sum(){
        int i =0 ;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        while(i < 2){
            System.out.println("Greater than 2");
            i = s.nextInt();
        }
        for(int x = 2; x <= i; x ++)
        {
            sum += x;
        }
        System.out.println(sum);
    }
    
    public static void table(){
       
       for(int x = 1; x <= 12; x ++){
           System.out.println("");
           for(int y = 1; y <= 12; y ++){
               System.out.print(x*y + " ");
            }
       }
    }   
}