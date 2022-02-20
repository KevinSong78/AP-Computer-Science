
public class ComboLock
{
    
    int first;
    int second;
    int third;
    int currentNumber = 0;
    int counter = 0;
    public ComboLock(int secret1, int secret2, int secret3)
    {
        first = secret1;
        second = secret2;
        third = secret3;
    }
    public void reset()
    {
        first = 0;
        second = 0;
        third = 0;
        currentNumber = 0;
    }
    public void turnLeft(int ticks)
    {   
        if(currentNumber -ticks < 0)
            {
            currentNumber += 39;
            }
        if(currentNumber == second)
        {
            currentNumber -= ticks;   
            counter ++;
        }
    }
    public void turnRight(int ticks)
    {
        int localCurrentNumber = currentNumber;
        if(localCurrentNumber +ticks < 0)
            {
                currentNumber += 39;
            }
            else if(currentNumber + ticks > 39)
            {
                currentNumber -= 39;
            }
        if(currentNumber == first)
        {
            currentNumber +=ticks;
            counter ++;
        }
        else if(currentNumber == third)
        {
            currentNumber += ticks;
            
            counter++; 
        }

    }
    public boolean open()
    {
        if(counter == 3)
        {
            return true;
            }
        return false;
        }
}