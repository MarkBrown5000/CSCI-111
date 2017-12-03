
/**
 * GroceryItem class to represent an actual Grocery Item along with it's cost and what aisle it can be found in.
 * 
 * @author (Mark Brown) 
 * @version (9/6/2014)
 */
public class GroceryItem
{   //Instance Variables
    private String name;
    private double cost;
    private int aisleNum;
    
    //Constructor
    public GroceryItem(String inName, double inCost, int inAisleNum)
    {
        name=inName;
        cost=inCost;
        aisleNum=inAisleNum;
    }
    //Methods
    //Get Methods
    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int getAisle()
    {
        return aisleNum;
    }
    
    //Method for changing cost
    public void changeCost(double newCost)
    {
     cost=newCost;  
    }
}

