
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet
{
    //Instance Variables
    protected String name;
    
    //Constructor
    public Pet(String name)
    {
        this.name = name;
    }
    
    //Methods
    public void setName(String n)
    {
        name = n;
    }
    public void printInfo()
    {
        System.out.println("The pet's name is " +  name);
        
    }

}
