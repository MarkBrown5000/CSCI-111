
/**
 * Write a description of class Array here.
 * 
 * @author Mark Brown 
 * @version 10/28/2014
 */
public class Array
{
    //Instance Variables
    private int[] array;    
    
    //Constructor
    public Array(int numElements)
    {
        array = new int[numElements];        
    }
    
    //Methods
    public void fill()
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 10);
        }
    }
    
    public void print()
    {
        System.out.print("-");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("--");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "|");
        }
        System.out.println();
        System.out.print("-");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("--");
        }
        System.out.println();
    }
    
    public void sort()
    {
        int swap = 0;
        boolean sorted = false;
        while(sorted == false)
        {
            sorted = true;
            for (int i = 0; i < array.length; i++)
            {
                int a = i + 1;
                swap = array[i];
                if (a < array.length && array[i] > array[a])
                {
                    sorted = false;
                    array[i] = array[a];
                    array[a] = swap;                    
                }
            }
            
        }
   }
    
    public void printFrequency()
    {
        int num = 0;
        for (int i = 0; i < 10; i++)
        {
            int frequency = 0;
            while(num < array.length && array[num] == i)
            {
                frequency++;
                num++;
            }
            System.out.println("There are " + frequency + ", " + i + "'s");
        }
        
    }
}
