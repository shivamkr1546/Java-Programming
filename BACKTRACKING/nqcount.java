package BACKTRACKING;

public class nqcount {
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static int count = 0;
    public static void nQueens(char board[][], int rows){
        if(rows==board.length){
            count++;
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board, rows, j)){
                board[rows][j]='Q';
                nQueens(board, rows+1);
                board[rows][j]='.';
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("-----chess board-----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][]=new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        nQueens(board,0);
        if(count==0)
            System.out.println("No solution possible");
        else
            System.out.println("Total no of solution possible are "+count);
    }
}
