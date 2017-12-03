
/**
 * Player Class for inlab4
 * 
 * @author Mark Brown 
 * @version 21 September 2014
 */
public class Player
{
    //Instance Variables
    private String name;
    private int numAtBat;
    private int numHit;
    private double battingAverage;
    
    //Constructor
    public Player(String inName)
    {
        name = inName;
    }
    
    //Methods
    //Get Methods
    public String getName()
    {
        return name;
    }
    
    
    public int getAtBat()
    {
        return numAtBat;
    }
    
      public int getNumHit()
    {
        return numHit;
    }
    
     public double getBattingAverage()
    {
        return battingAverage;
    }
    
    //Method to get number of at bats for player.
    public void addAtBats(int atBats)
    {
        numAtBat = atBats;
    }
    
    //Method to get number of hits for player.
    public void addHits(int hits)
    {
        numHit = hits;
    }
    
    //Method to calculate each players batting average
    public double battingAverage()
    {
       return battingAverage = (double) numHit/numAtBat;
    }
    
    //Method to print out individual player stats.
    public String printStats()
    {
        return (String) (name + "---> AtBats: " + getAtBat() + ", Hits: " + getNumHit() + ", Batting Avg: " + battingAverage());
    }

}
