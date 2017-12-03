
/**
 * Player class.  Reads in human inputs and allows computer to make a move.
 * 
 * @author (Mark Brown) 
 * @version (11/5/2014)
 */

import java.util.Scanner;

public class Player
{
    //Instance Variables
    Board board;
    String player;
    
    //Constructor
    public Player(Board b, String a)
    {
        board = b;
        player = a;        
    }
    
    //Methods
    //Method that allows the computer to choose a spot on the board
    public void computerMove()
    {
        int row = (int)(Math.random() * 3);
        int col = (int)(Math.random() * 3);        
        if (board.spotTaken(row, col) == false)
        {
            board.setMove(row, col, player);
        }
        
        else
        {
            computerMove();
        }       
    }
    
    //Method that allows the human player to choose a spot on the board
    public void humanMove()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What row would you like? >");
        int r = in.nextInt();           
        System.out.println("What column would you like? >");
        int c = in.nextInt(); 
        if (board.spotTaken(r, c) == true)
        {
            System.out.print("Spot taken.  Please choose a new spot.");
            System.out.println();
            humanMove();
        }       
        else
        {
            board.setMove(r, c, player);
        }
    }
}
