public class Door
{
    private boolean isOpened;
    private String name;
    
    public void open()
    {
        this.isOpened = true;
    }
    
    public void close()
    {
        this.isOpened = false;
    }
    
    public Door(String initialName, boolean initialIsOpened)
    {
        this.name = initialName;
        this.isOpened = initialIsOpened;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean getState()
    {
        return this.isOpened;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public Door()
    {
        Door myDoor = new Door("front", true);
    }
    
    
   
    
}