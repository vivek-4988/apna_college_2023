package com.vivekjava.backtracking;

public class Sudoku {


    public static void printArr(int[][] arr){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 ; j++) {
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println();
        }

    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        //base
        if (row == 9 && col == 0) {
            return true;
        } else if (row == 9) {
            return false;
        }

        //
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        //recursion
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    //solution exist
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        //grid checking
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for (int i = sr; i<sr+3 ; i++) {
            for (int j = sc; j <sc+3 ; j++) {
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[][] sudoku = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

      boolean sol =  sudokuSolver(sudoku,0,0);
      if (sol){
        printArr(sudoku);
      }else{
          System.out.println("Not exist");
      }
    }
}
