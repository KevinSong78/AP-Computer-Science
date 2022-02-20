public class annuity
{
    public static double calcPresentValue(double pmt, double i, int n)
    {
        
        double var1 = (Math.pow((1 + i),n - 1) - 1);
        double var2 = i;
        double var3 = (Math.pow((1+i),n-1));
        double var4 = ((var1 / var2 / var3) + 1);
        double pva = (var4 * pmt);
        return pva;
    }
}