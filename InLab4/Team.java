
/**
 * Team class for inlab4
 * 
 * @author Mark Brown
 * @version 21 September 2014
 */
public class Team
{
    //Instance Variables
    private String name;
    private Player p1;
    private Player p2;
    private Player p3;
    private int teamAtBat;
    private int teamHits;
    //Constructor
    public Team(String inName, Player inP2, Player inP1, Player inP3)
    {
        name = inName;
        p2 = inP2;
        p1 = inP1;
        p3 = inP3;
    }
    
    //Methods
    //Method to calcualate number of at bats for the entire team.
    public int tAtBat()
    {
        return teamAtBat = p1.getAtBat() + p2.getAtBat() + p3.getAtBat();
    }
    
    //Method to calculate number of hits for the entire team.
    public int teamHits()
    {
        return teamHits = p1.getNumHit() + p2.getNumHit() + p3.getNumHit();
    }
    
    //Method to calculate batting average for the entire team.
    public double teamBattingAverage()
    {
        return (double) teamHits()/tAtBat();
    }
    
    //Method to print stats for the entire team.
    public void printStats()
    {
        System.out.println(name +": ");
        System.out.println("    At Bats: " + tAtBat());
        System.out.println("    Hits: " + teamHits());
        System.out.println("    Batting Avg: " + teamBattingAverage());
        System.out.println("    Players:");
        System.out.println("        " + p2.printStats());
        System.out.println("        " + p1.printStats());
        System.out.println("        " + p3.printStats());
        
    }
    
    

}
