import java.util.Scanner;

public class Spectrum
{
    public static void spectrum()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter wavelength length");
        double wave = s.nextDouble();
        if(wave > 0.1)
        {
           System.out.println("The frequency is less than 3 * 10^9");
        }
        else if(wave > 0.001)
        {
            System.out.println("The frequency is between 3*10^9 - 3*10^11");
        }
        else if (wave>0.0000007)
        {
            System.out.println("This is an infrared wave");
        }
    }
}
