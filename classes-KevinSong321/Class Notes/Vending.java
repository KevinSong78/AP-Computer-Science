public class Vending
{
    private double cans;
    private double tokens;
    
    public void fillUp(int addcans)
    {
        this.cans += addcans;
    }
    
    public void input_tokens(int inputTokens)
    {
        this.tokens += inputTokens;
        this.cans -= inputTokens;
    }
    
    public double getCanCount()
    {
        return this.cans;
    }
    
    public double getTokenCount()
    {
        return this.tokens;
    }
    
    public Vending()
    {
        this.cans = 10;
        this.tokens = 0;
    }
    
    public Vending(double initialCans)
    {
        this.cans = initialCans;
        this.tokens = 0;
    }
}
