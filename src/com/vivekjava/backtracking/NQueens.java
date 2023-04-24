package com.vivekjava.backtracking;

public class NQueens {

    public static void main(String[] args) {
        int n  = 4;
        char[][] board = new char[n][n];
        //initialize
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board,0);

    }

    private static void nQueens(char[][] board, int row) {

        //base
        if (row == board.length){
            printboard(board);
            return;
        }

        //column
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board,row+1);
                board[row][j] = 'x';//backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        //vertically safe ?
        for (int i = row-1; i >=0 ; i--) {
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        //diag left safe ?
        for (int i = row-1,j = col-1; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diag right safe ?
        for (int i = row-1,j = col+1; i >=0 && j< board.length ; i--,j++) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printboard(char[][] arr){
        System.out.println("-- ChessBoard --");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
