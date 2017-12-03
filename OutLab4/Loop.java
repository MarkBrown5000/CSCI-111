
/**
 * Write a description of class Loop here.
 * 
 * @author (Mark Brown) 
 * 10/19/2014
 */
public class Loop
{
    //Instance Variables
    
    //Constructor
    public Loop()
    {
        
    }
    
    //Methods
    //Method for loop 1
    public static void loop1(int lb, int ub, int incr)
    {
        for(int i = lb; i <= ub; i += incr)
        {
            System.out.println(i);
        }
    }
    //Method for loop 2
    public static void loop2(int lb, int ub, int incr)
    {
        lb = 0;
        while(lb <= ub)
        {
            System.out.println(lb);  
            lb += incr;           
        }
        
    }
    //Method for loop 3
    public static void loop3()
    {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 1; i <= 26; i++)
        {
            System.out.println(alph.substring(0,i));
        }
   
        
    }
    //Method for loop 4
    public static void loop4(int val)
    {
        int numTimes = 0;
        int numCorrectTimes = 0;
        for(numTimes = 1; numTimes <= 10; numTimes++)
        {
            int roll = (int) (Math.random() * 10) + 1;           
            if(roll == val)
            {
                numCorrectTimes++;
            }
        }
        System.out.println(val + " was found " + numCorrectTimes + " times");
    }
    //Method for loop 5
    public static void loop5(int val)
    {
        int numTimes = 0;
        int numCorrectTimes = 0;
        while(numCorrectTimes < 5)
        {
            numTimes++;
            int roll = (int) (Math.random() * 10) + 1;
            if(roll == val)
            {
                numCorrectTimes++;
            }
        }
        System.out.println("It took " + numTimes + " iterations to generate " + val + " five times.");
    }

}
