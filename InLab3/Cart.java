
/**
 * Write a description of class Cart here.
 * 
 * @author Mark Brown 
 * @version 13 September 2014
 */
public class Cart
{
   //Instance Variables
   private String name;
   private GroceryItem GroceryItem1;
   private GroceryItem GroceryItem2;
   private int numOfUnit1;
   private int numOfUnit2;
   
   
   //Constructor
    public Cart (String inName)
    {
     name = inName;
    }
   
    //Methods
    public String getName()
    {
    return name;
    }
   
    public void addItem1(GroceryItem item, int amount)
    {
     GroceryItem1 = item;
     numOfUnit1 = amount;
     
     GroceryItem1.incrementNumItem(-amount);
    }
    
    public void addItem2(GroceryItem item, int amount)
    {
     GroceryItem2 = item;
     numOfUnit2 = amount;
     
     GroceryItem2.incrementNumItem(-amount);
    }
    
    public double getTotalItemCost1()
    {
        return GroceryItem1.getCost() * numOfUnit1;
    }
    
    public double getTotalItemCost2()
    {
        return GroceryItem2.getCost() * numOfUnit2;
    }
    
    public double getSubTotal()
    {
        return getTotalItemCost1() + getTotalItemCost2();
    }
    
    public double getTax()
    {
        return getSubTotal() * .07;
    }
    
    public double getTotal()
    {
        return getSubTotal() + getTax();
    }
    public void printReceipt()
    {
     System.out.println("Shopper's Name: " + name); 
     System.out.println("----------------------");
     System.out.println(GroceryItem1.getName() + ": " + numOfUnit1 + " units at $"+ GroceryItem1.getCost() + "per unit = $" + getTotalItemCost1());
     System.out.println(GroceryItem2.getName() + ": " + numOfUnit2 + " units at $"+ GroceryItem2.getCost() + "per unit = $" + getTotalItemCost2());
     System.out.println("   ----> Subtotal = $" + getSubTotal());
     System.out.println("   ----> 7% tax = $" + getTax());
     System.out.println("   ----> Total = $" + getTotal());
     System.out.println();
     System.out.println();
     System.out.println();
    }
  
}
