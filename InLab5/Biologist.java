
/**
 *Class for biologist.
 * 
 * @author Mark Brown 
 * @version 29 September 2014
 */
public class Biologist
{
    //Methods
    static public void identifyAnimal(Animal a)
    {   System.out.println(a.getNumLegs() + " legs");
        switch(a.getNumLegs())
        {
            case 0: 
                if(a.getEnvironment() == "land")
                {
                     System.out.println("Lives on " + a.getEnvironment());
                    System.out.println("---> Sounds like a snake");
                }
                else if(a.getEnvironment() == "water")

                {
                    System.out.println("Lives in the " + a.getEnvironment());
                    System.out.println("---> It's probably a fish");
                }
                else if(a.getEnvironment() == "air")

                {
                    System.out.println("Lives in the " + a.getEnvironment());
                    System.out.println("---> I don't know, sounds fake");
                }
                break;
                
            case 2:
                if(a.getEnvironment() == "land")
                {
                    System.out.println("Lives on " + a.getEnvironment());
                    if(a.getSeemsNice() == true)
                    {
                        System.out.println("Seems nice");
                        System.out.println("---> Bro, that's your classmate");
                    }
                    else if(a.getSeemsNice() == false)
                    {
                        System.out.println("Doesn't seem nice");
                        System.out.println("---> Bigfoot.  Take a picture");
                    }
                }
                else if(a.getEnvironment() == "air")
                {
                    System.out.println("Lives in the " + a.getEnvironment());
                    System.out.println("--->Easy one:  Bird.");
                }
                break;
               
            case 4:
                if(a.getSeemsNice() == true)
                {
                    System.out.println("Seems nice");
                    System.out.println("--->Probably a dog");
                }
                else if(a.getSeemsNice() == false)
                {
                    System.out.println("Doesn't seem nice");
                    System.out.println("---> Skunk.  Watch out!");
                }
                break;
               
            default: System.out.println( "Hurt or creepy crawly");   
        }
    }
    
    static public void petOrNot(Animal a)
    {
        if(a.getSeemsNice() == true && a.getNumLegs() == 4)
        {
            System.out.println("Pet");
        }
        else if(a.getSeemsNice() == false || a.getNumLegs() == 0)
        {
            System.out.println("Don't pet");
        }
        else
        {
            System.out.println("Pet at your own risk");
        }
        System.out.println();
    }
}
