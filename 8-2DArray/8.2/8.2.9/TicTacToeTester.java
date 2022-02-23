import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe board = new TicTacToe();
        System.out.println("Welcome to Tic Tac Toe!");
        while(!board.checkWin() && board.getTurn() < 9)
        {
            board.printBoard();
            System.out.println("Enter your Row Pick:" );
            int row = input.nextInt();
            System.out.println("Enter your Col Pick:" );
            int col = input.nextInt();
            if(board.pickLocation(row, col))
            {
                board.takeTurn(row, col);
            }
            else
            {
                System.out.println("That space is taken, or you entered an invalid row/col");
            }
            
        }
        board.printBoard();
        if(!board.checkWin())
        {
            System.out.println("Game ends in a tie!");
        }
        else if (board.getTurn()%2 == 0)
        {
            System.out.println("O Wins!");
        }
        else
        {
            System.out.println("X Wins!");
        }
    }
}
