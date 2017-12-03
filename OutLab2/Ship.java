
/**
 * Ship class for outlab2.
 * 
 * @author Mark Brown 
 * @version 17 September 2014
 */
public class Ship
{
    //Instance Variables
    private String name;
    private int fuelCap;
    private double currentFuel;
    private double usedFuel;
    
    //Constructor
    public Ship(String inName, int inFuelCap)
    {
        name = inName;
        fuelCap = inFuelCap;
        currentFuel = fuelCap;
    }
    
    //Methods
    //Get Methods
    public String getName()
    {
        return name;
    }
    
    public double getUsedFuel()
    {
        return usedFuel;
    }
    //Method to deploy a ship (calculates current fuel and fuel used)
    public void deploy()
    {
        currentFuel = currentFuel/2;
        usedFuel = currentFuel + usedFuel;
    }
    //method to refuel a shi
    public void reFuel()
    {
         currentFuel = fuelCap;
    }
    
}
