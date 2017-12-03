
/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Pet
{
    //Instance Variables
    private String color;
    
    //Constructor
    public Fish(String inColor)
    {
        super("Swimmy");
        
        color = inColor;
    }
    
    //Methods    
    public void printInfo()
    {
       System.out.println("The fish is " + color + " and it's name is " + name);
    }

}
