
/**
 * Class for petals game.
 * 
 * @author Mark Brown 
 * @version (a version number or a date)
 */
public class PetalsGame
{
    //Instance Variables
    private int d1;
    private int d2;
    private int d3;
    private int d4;
    private int d5;
    //Constructor    
    public PetalsGame()
    {
        
    }
    
    //Methods
    public void rollDice()
    {   
        d1 = (int)(Math.random() * 6) + 1;
        d2 = (int)(Math.random() * 6) + 1;
        d3 = (int)(Math.random() * 6) + 1;
        d4 = (int)(Math.random() * 6) + 1;
        d5 = (int)(Math.random() * 6) + 1;        
    }
    
    public void printDice()
    {
        System.out.println("You rolled the following: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 +", " + d5);
    }
    
     public int calculateAllPetals()
    {
        return getValue(d1) + getValue(d2) + getValue(d3) + getValue(d4) + getValue(d5);
    }
     
    public int getValue(int d)
    {
        switch(d)
        {
            case 3: return 2;
            case 5: return 4;
           
            default: return 0;
        }
    }

   
}
