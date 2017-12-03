/**
 * Write a description of class Battleship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Battleship
{
    //Instance Variables
    private Spot[][] board;
    private int hit;
    private int guess;

    //Constructor
    public Battleship(int i, int j)
    {
        board = new Spot[i][j];
        for (i = 0; i < board.length; i++)
        {
            for(j = 0; j < board[i].length; j++)
            {
                board[i][j] = new Spot();
            }
        }
    }
    //Methods
    //Calls the placeShip() method and sets the board with the ships.
    public void setBoard()
    {
        {
            for(int shipLength = 5; shipLength > 1; shipLength--)
            {
                placeShip(shipLength);
            }

        }

    }
    //Method that prints out both the revealed and hidden board.
    public void printBoard(boolean reveal)
    {
        {
            for (int i = 0; i < board.length; i++)
            {
                System.out.print("  ");
                for (int j = 0; j < board[i].length; j++)
                {
                    System.out.print("+-");
                }
                System.out.print("+");
                System.out.println();
                System.out.print(i + 1 + " ");
                System.out.print("|");
                for(int j = 0; j < board[i].length; j++)
                {
                    if(reveal == true)
                    {
                        System.out.print(board[i][j].getShip() + "|");
                    }
                    else if (reveal == false)
                    {
                        if (board[i][j].getVisited() == true)
                        {
                            System.out.print(board[i][j].getShip() + "|");
                        }
                        else
                        {
                            System.out.print(" |");
                        }
                    }
                }
                System.out.println();                  
            }  
            System.out.print("  ");
            for (int i = 0; i < board.length; i++)
            {
                if (i < 1)
                {
                    for (int j = 0; j < board[i].length; j++)
                    {
                        System.out.print("+-"); 
                    }
                    System.out.print("+");
                }
                System.out.println();
                if (i < 1)
                {
                    System.out.print("   ");
                    for(int j = 0; j < board[i].length; j++)
                    {
                        System.out.print(j + 1 + " ");
                    }
                }   
            }
        }
    }
    //Method that places each individual ship on the board.
    public void placeShip(int size)
    {
        boolean set = false;
        while(set == false)
        {
            boolean vertical = false;
            int clear = 0;
            for (int i = 0; i < board.length; i++)
            {
                for (int j = 0; j < board[i].length; j++)
                {
                    int r = (int)(Math.random() * board.length);
                    int c = (int)(Math.random() * board[i].length);
                    double v = Math.random();
                    if (v < .5)
                    {
                        vertical = true;
                    }
                    if (vertical == false)
                    {
                        if (c == 0)
                        {
                            for (int s = c; s < c + size; s++)
                            {
                                if (s < board[i].length && board[r][s].getShip() == 0)
                                {
                                    clear++;
                                    if (clear == size)
                                    {
                                        for (s = c; s < c + size; s++)
                                        {
                                            board[r][s].setShip(size);
                                        }
                                        set = true;
                                    }
                                }
                            }
                        }
                    }
                    else if(vertical == true)
                    {
                        if (r == 0)
                        {
                            for (int s = r; s < r + size; s++)
                            {
                                if (s < board.length && board[s][c].getShip() == 0)
                                {
                                    clear++;
                                    if (clear == size)
                                    {
                                        for (s = r; s < r + size; s++)
                                        {
                                            board[s][c].setShip(size);
                                        }
                                        set = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //Method that allows the user to make a guess.
    public void makeGuess()
    {
        Scanner in = new Scanner(System.in);

        try
        {
            System.out.print("Enter a row to guess > ");
            int r= in.nextInt() - 1;
            System.out.print("Enter a column to guess > ");
            int c = in.nextInt() - 1;
            if(r >= board.length || r < 0)
            {
                System.out.println("Error:  Invalid row.");
                System.out.println();
                makeGuess();
            }
            else if (c >= board[r].length || c < 0)
            {
                System.out.println("Error:  Invalid Column.");
                System.out.println();
                makeGuess();
            }
            else if (board[r][c].getVisited() == true)
            {
                System.out.println("You already chose that spot.  Please choose again.");
                System.out.println();
                makeGuess();
            }
            else
            {
                board[r][c].setVisited(true);
                guess++;
                if (board[r][c].getShip() == 5)
                {
                    System.out.println("Hit!  You just hit the carrier.");
                    System.out.println();
                    hit++;
                }
                else if (board[r][c].getShip() == 4)
                {
                    System.out.println("Hit!  You just hit the battleship.");
                    System.out.println();
                    hit++;
                }
                else if (board[r][c].getShip() ==3)
                {
                    System.out.println("Hit!  You just hit the submarine.");
                    System.out.println();
                    hit++;
                }
                else if (board[r][c].getShip() == 2)
                {
                    System.out.println("Hit!  You just hit the patrol boat.");
                    System.out.println();
                    hit++;
                }
                else if (board[r][c].getShip() == 0)
                {
                    System.out.println("Miss!  There was nothing at that location.");
                    System.out.println();
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error.  You did not enter an integer value.  Please try again.");
        }
    }
    //Method that determines whether or not the game is over.
    public boolean over()
    {
        boolean done = false;
        if (hit == 14)
        {
            done = true;
        }
        return done;
    }
    //Method that prints out the number of guesses it took to win, excluding invalid guesses.
    public void printStatistics()
    {
        System.out.println("It took " + guess + " guesses to win.");
        System.out.println();
    }
}
