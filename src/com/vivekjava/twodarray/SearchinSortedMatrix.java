package com.vivekjava.twodarray;

class SearchinSortedMatrix {

    public static boolean stairCaseSearch(int[][] mat, int key) {
        int row = 0, col = mat[0].length - 1;
        while (row < mat.length && col >= 0) {
            if (mat[row][col] == key) {
                System.out.println("found (" + row + "," + col + ")");
                return true;
            } else if (key < mat[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int key = 37;
        System.out.println(stairCaseSearch(matrix, key));
    }
}