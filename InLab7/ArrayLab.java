
/**
 * Write a description of class ArrayLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayLab
{
    //Instance Variable
    private int[] array;
    
    //Constructor
    public ArrayLab(int numElements)
    {
        array = new int[numElements];
    }
    
    //Methods
    public void initialize()
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 10);
        }
        System.out.println();
        
    }
    
    public void print()
    {
        System.out.print(array[0]);
         for(int i = 1; i < array.length; i++)
        { 
            System.out.print(", " + array[i]);
        }
        System.out.println();
        
    }
    
    public void printStats()
    {
        int max = 0;
        int min = 10;
        int arrayTotal = 0;
         for(int i = 0; i < array.length; i++)
        {
            arrayTotal += array[i];
            if(array[i] > max)
            {
                max = array[i];
            }

            
            if(array[i] < min)
            {
                min = array[i];
            }                        
        }
        System.out.print("\nAverage Value: " + (double)arrayTotal/array.length);
        System.out.print("\nMaximum Value: " + max);
        System.out.print("\nMinimum Value: " + min + "\n");        
    }
    
    public void search(int num)
    {
        boolean numFlag = false;
         for(int i = 0; i < array.length; i++)
        {
            if(array[i] == num)
            {
                numFlag = true;
            }
        }
        if(numFlag == true)
        {
            System.out.println(num + " was found.");
        }
        
        else
        {
            System.out.println(num + " was not found.");
        } 
    }
}
