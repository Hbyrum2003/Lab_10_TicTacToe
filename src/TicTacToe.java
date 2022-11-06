import java.util.Scanner;

public class TicTacToe {
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board[][] = new String[ROW][COL];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    displayBoard();
    while(true){
        System.out.println("Enter the row you would like to go if");
        int playerARow=in.nextInt();
        System.out.println("Enter the column you would like to go to");
        int playerACol=in.nextInt();



    }

    }

    private static void clearBoard() {
        for (int row = 0; row < ROW; row++) {
            {
                for (int col = 0; col < COL; col++) {
                    board[row][col] = " ";
                }
            }
        }
    }
    private static void placePiece(String [][]board,String player, int pos){
        String symbol = "X";
        switch(pos){
            case 1:
                board[0][0]=symbol;
                break;
            case 2:
                    board[0][2]=symbol;
                    break;
            case 3:
                    board[0][4]=symbol;
                    break;
            case 4:
                    board[2][0]= symbol;
                    break;
            case 5:
                    board[2][2]=symbol;
                    break;
            case 6:
                board[2][4]=symbol;
                break;
            case 7:
                board[4][0]=symbol;
            case 8:
                board[4][2]=symbol;
                break;
            case 9:
                board[4][4]=symbol;
                break;
            default:
                break;
        }
    }
   private static void displayBoard(){
        for(int r=0; r<ROW; r++){
            for(int c=0; c<COL;c++){
                System.out.printf("|%3s", board[r][c]);
            }
            System.out.println("|");
        }

    }
    private static boolean isMoveValid(int row, int col){
        boolean retVal=false;
        if(board[row][col].equals(" ")){
            retVal=true;

        }return retVal;
    }


    private static boolean isWin(String player){
        if(isColWin(player) ||isRowWin(player)|| isDiagonalWin(player)){
            return true;
        }
        return false;
    }
    private static boolean isRowWin(String player){
        for(int row=0; row<ROW;row++)
        {
            if(board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)){
                return true;
            }
        } return false;
    }
    private static boolean isColWin(String player){
        for(int col=0; col<COL;col++)
        {
            if(board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)){
                return true;
            }
        }return false;
    }
    private static boolean isDiagonalWin(String player){
        if(board[0][0].equals(player) && board[1][1].equals(player)&& board[2][2].equals(player)){
            return true;
        } else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            return true;

        }
        return false;
    }

}