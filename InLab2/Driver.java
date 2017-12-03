
/**
 * Gives title of book, number in stock, and cost per book.
 * 
 * @author (Mark Brown) 
 * @version (09/8/2014)
 */
public class Driver
{
    public static void main(String[] args)
    {
        Book Book1; 
        Book1 = new Book ("Dracula", 22, 7.55);
        System.out.println(Book1.getTitle());
        System.out.println("Number in Stock: " + Book1.getNumInStock());
        System.out.println("Cost: " + Book1.getCost());
        
        
        Book Book2;
        Book2 = new Book ("Frankenstein", 36, 6.33);
        System.out.println(Book2.getTitle());
        System.out.println("Number in Stock: " + Book2.getNumInStock());
        System.out.println("Cost: " + Book2.getCost());
        
    }
}
