public class TicTacToe
{
    //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
    private int turn;
    private String[][] board;
    
    public TicTacToe()
    {
        this.board = new String[][] {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        this.turn = 0;
    }
    public String[][] getBoard()
    {
        return this.board;
    }
    //this method returns the current turn
    public int getTurn()
    {
        return this.turn;
    }
    /*This method prints out the board array on to the console
     */
    public void printBoard()
    {
        for(int i = -1; i < 3; i++)
        {
            for(int j = -1; j < 3; j++)
            {
                //leave the top-left corner blank
                if(i < 0 && j < 0) {
                    System.out.print(" ");
                }
                else if(i < 0) {
                    System.out.print(j);
                }
                else if(j < 0) {
                    System.out.print(i);
                }
                else {
                    System.out.print(board[i][j]);
                    
                }
                if(i > -1 || j < 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col)
    {
        return board[row][col].equals("-");
    }
    //This method places an X or O at location row,col based on the int turn
    public void takeTurn(int row, int col)
    {
        if(turn % 2 == 0) {
            board[row][col] = "X";
        }
        else {
            board[row][col] = "O";
            
        }
        turn++;
    }
    //This method returns a boolean that returns true if a row has three X or O's in a row
    public boolean checkRow()
    {
        for(String[] row : board)
        {
            int xInRow = 0;
            int oInRow = 0;
            for(String space : row)
            {
                if(space.equals("X")) {
                    xInRow++;
                }
                else {
                    xInRow = 0;
                    
                }
                if(space.equals("O")) {
                    oInRow++;
                }
                else {
                    oInRow = 0;
                    
                }
                if(xInRow >= 3 || oInRow >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
    //This method returns a boolean that returns true if a col has three X or O's
    public boolean checkCol()
    {
        for(int row = 0; row < 3; row++)
        {
            int xInRow = 0;
            int oInRow = 0;
            for(int col = 0; col < 3; col++)
            {
                if(board[col][row].equals("X")) {
                    xInRow++;
                }
                else {
                    xInRow = 0;
                    
                }
                if(board[col][row].equals("O")) {
                    oInRow++;
                }
                else {
                    oInRow = 0;
                    
                }
                if(xInRow >= 3 || oInRow >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
    //This method returns a boolean that returns true if either diagonal has three X or O's
    public boolean checkDiag()
    {
        String diag1 = board[0][0] + board[1][1] + board[2][2];
        String diag2 = board[0][2] + board[1][1] + board[0][2];
        
        return diag1.equals("XXX") || diag1.equals("OOO") || diag2.equals("XXX") || diag2.equals("OOO");
    }
    //This method returns a boolean that checks if someone has won the game
    public boolean checkWin()
    {
        return checkDiag() || checkCol() || checkRow();
    }
}
}
