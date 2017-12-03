
/**
 * Class that gives book title, number in stock, and cost per book.
 * 
 * @author (Mark Brown) 
 * @version (09/08/2014)
 */
public class Book
{//Instance Variables
    private String title;
    private int numInStock;
    private double cost;
    
    //Constructor
    public Book(String inTitle, int inNumInStock, double inCost)
    {
        title=inTitle;
        numInStock=inNumInStock;
        cost=inCost;
    }
    //Methods   
    //Get Methods
    public String getTitle()
    {
     return title;
    }
    
    public int getNumInStock()
    {
     return numInStock;   
    }
    
    public double getCost()
    {
     return cost;   
    }
    
    //Method to return total value of book in stock
    public double getTotalBookValue()
    {
       return numInStock * cost; 
    }
    
}
