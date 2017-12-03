
/**
 * Fleet class for outlab2.
 * 
 * @author Mark Brown 
 * @version 17 September 2014
 */
public class Fleet
{
    //Instance Variables
    private Ship ship1;
    private Ship ship2;
    private Ship ship3;
    private Ship ship4;
    
    //Constructor
    public Fleet(Ship inShip1, Ship inShip2, Ship inShip3, Ship inShip4)
    {
        ship1 = inShip1;
        ship2 = inShip2;
        ship3 = inShip3;
        ship4 = inShip4;
        
    }
    
    //Methods
    //Method to deploy a fleet
    public void deploy()
    {
        ship1.deploy(); 
        ship2.deploy();
        ship3.deploy();
        ship4.deploy();
    }
    
    //Method to refuel a fleet
    public void reFuel()
    {
        ship1.reFuel();
        ship2.reFuel();
        ship3.reFuel();
        ship4.reFuel();
    }
    
    //Print method
    public void printSummary()
    {
       System.out.println(ship1.getName() + " burned this many units of fuel: " + ship1.getUsedFuel());
       System.out.println(ship2.getName() + " burned this many units of fuel: " + ship2.getUsedFuel());
       System.out.println(ship3.getName() + " burned this many units of fuel: " + ship3.getUsedFuel());
       System.out.println(ship4.getName() + " burned this many units of fuel: " + ship4.getUsedFuel());
    }
}
