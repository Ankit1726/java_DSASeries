package BackTracking;

import java.util.Scanner;

public class N_Queens {
    public static boolean isSafe(char board[][],int row,int col){
        // Vertical up
        for (int i=row-1;i>=0;i--){
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        // Diagonal left Up
        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        // Diagonal right Up
        for (int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        // Base Case
        if (row == board.length){
            printBoard(board);
            return;
        }
        // col loop
        for (int j=0;j<board.length;j++){
            if (isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board,row+1);  // Function call
                board[row][j] = 'X';  // Backtrack Step
            }

        }
    }
    public static void printBoard(char board[][]){
        System.out.println("-----chess board-----");
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        System.out.println("pls enter your value of n -> ");
        int n = input.nextInt();
        char board[][] = new char[n][n];
        // Initialise
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
    }
}
