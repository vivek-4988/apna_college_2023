package com.vivekjava.twodarray;

import java.util.Scanner;

class Create2dSearch {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        //inserting in matrix
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //printing matrix
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //finding
        int search = 5;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == search){
                    System.out.println(search+" key search at : "+"("+i+")"+"("+j+")");
                    break;
                }
            }
        }

    }
}