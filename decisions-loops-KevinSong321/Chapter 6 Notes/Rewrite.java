import java.util.Scanner;
public class Rewrite
{
    public static int method1(int kappa)
    {
        int s = kappa;
        for (int i = 1; i <= 10; i++)
        {
            s = s + i;
        }
        return s;
    }
    public static int method(int kappa)
    {
        int i = 1;
        int s = kappa;
        do 
        {
            s = s + i;
            i++;
        }
        while(i <= 10);
        return s;
    }
    
    public static double method3()
    {
        Scanner in = new Scanner( System.in );
        System.out.print("enter an integer: ");
        int n = in.nextInt();
        double x = 0;
        double s;
        do
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        while (s > 0.01);
        return x;
    }
    public static double method4()
    {
        Scanner in = new Scanner( System.in );
        System.out.print("enter an integer: ");
        int n = in.nextInt();
        double x = 0;
        double s = 1;
        while (s>0.01)
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        return x;
    }
}