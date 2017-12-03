
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Mammal
{
    //Instance Variables
    private String name;
    private String breed;
    
    //Constructor
    public Dog(String inName, String inBreed)
    {
        super();
        name = inName;
        breed = inBreed;
    }
    
    //Methods
    public void printInfo()
    {
        System.out.println("The dog's name is " + name + " and it's a " + breed);
    }

}
