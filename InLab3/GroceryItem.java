/**
 * GroceryItem Inlab.
 * 
 * @author Mark Brown
 * @version 13 Sep 2014
 */
public class GroceryItem
{
    private String name;        //item name
    private double cost;        //cost of 1 unit of item
    private int numItems;
    
    // constructor for GroceryItems
    public GroceryItem(String inName, double inCost, int inNumItems)
    {
        name = inName;
        cost = inCost;
        numItems = inNumItems;
    }
    
    // returns the item's name
    public String getName()
    {
        return name;
    }
    
    // returns the cost of 1 item
    public double getCost()
    {
        return cost;
    }
    
    public void incrementNumItem(int change)
    {
       numItems += change;
    }
    public void printInventory()
    {
    System.out.println("There are " + numItems + " of " + name +" in stock");
    }
}