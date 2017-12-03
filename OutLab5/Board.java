
/**
 * Board class.  Creates the board, prints the board, and checks for winners or errors.
 * 
 * @author (Mark Brown) 
 * @version (11/5/2014)
 */
public class Board
{
    //Instance Variables
    private String[][] tBoard;
    private boolean over = false;
    private String winner;
    
    //Constructor.  Sets inititial value of spots on the board to a blank space.
    public Board()
    {
        tBoard = new String[3][3];
        for (int i = 0; i < 3; i++)
            {
                for( int j = 0; j < 3; j++)
                {
                    tBoard[i][j] = " ";                    
                }                    
            }
    
    }
    
    //Methods
    //Method that prints out the board.
    public void print()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.print(tBoard[i][0] + "|");
            System.out.print(tBoard[i][1] + "|");
            System.out.print(tBoard[i][2]);
            System.out.println();
            if (i < 2)
            {
            System.out.println("-----");
            }
        }        
    }
    
    //Checks to see if a player won with three in a row.
    public boolean filledRow()
    {
        over = false;
        for (int i = 0; i < 3; i++)
        {
            if (tBoard[i][0] == tBoard[i][1] && tBoard[i][1] == tBoard[i][2] && tBoard[i][0] != " ")
            {
                over = true;
                if (over == true && tBoard[i][1] == "X")
                {
                winner = "X";
                }
            
                else if (over == true && tBoard[i][1] == "O")
                {
                winner = "O";
                }
            }
        }
        return over;
    }
    
    //Checks to see if a player won with three in a column.
    public boolean filledCol()
    {
        over = false;
        for (int i = 0; i < 3; i++)
        {
            if (tBoard[0][i] == tBoard[1][i] && tBoard[1][i] == tBoard[2][i] && tBoard[0][i] != " ")
            {
                over = true;
                if (over == true && tBoard[1][i] == "X")
                {
                winner = "X";
                }
            
                else if (over == true && tBoard[1][i] == "O")
                {
                winner = "O";
                }
            }             
        }
        return over;
    }
    
    //Checks to see if a player won with three in a diagonal.
    public boolean filledDiag()
    {
        over = false;
            if (tBoard[0][0] == tBoard[1][1] && tBoard[1][1] == tBoard[2][2] && tBoard[0][0] != " ")
            {
                over = true;
            }
                
            else if(tBoard[0][2] == tBoard[1][1] && tBoard[1][1] == tBoard[2][0] && tBoard[0][2] != " ")
            {
                over = true;
            } 
                
                if (over == true && tBoard[1][1] == "X")
            {
                winner = "X";
            }
            
            else if (over == true && tBoard[1][1] == "O")
            {
                winner = "O";
            }
                return over;
    }
    
    //Checks to see if the board is full, resulting in a tie.
    public boolean filledBoard()
    {
        over = false;
        int filled = 0;   
        for (int i = 0; i < 3; i++)
        {            
            for (int j = 0; j < 3; j++)
            {
                if (tBoard[i][j] != " ")
                {
                    filled++;
                }                   
            }
        }
        if (filled == 9)
        {
            over = true;
        }
        return over;
    }
    
    //Determines whether or not the game is over.  If it is, the printWinner() methods is called.  If it is not, either the computer or human player takes another turn.
    public boolean gameOver()
    {
        if (filledRow() == true || filledCol() == true || filledDiag() == true ||  filledBoard() == true)
        {
            over = true;
        }
        return over;
    }
    
    //Prints out the winner of the game (either "X" or "O") or that the game is a tie.
    public void printWinner()
    {
        if (filledRow() == true || filledCol() == true || filledDiag() == true)
        {
            System.out.println("Game over!");
            System.out.println(winner + " - won!");
        }
        
        else if (filledBoard() == true)
        {
            System.out.println("Game over!");
            System.out.println("Board is full.  Tie!");
        }                
    }
    
    //Designates the spot chosen by either the human or computer player.
    public void setMove(int row, int col, String player)
    {
        tBoard[row][col] = player;
    }
    
    //Checks whether or not the spot chosen is already taken.
    public boolean spotTaken(int row, int col)
    {
        boolean taken = false;
        if (tBoard[row][col] != " ")
        {
            taken = true;
        }  
        return taken;
    } 
    
    
} 
