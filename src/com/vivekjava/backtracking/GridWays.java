package com.vivekjava.backtracking;

public class GridWays {


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
    }

    public static int gridWays(int i , int j,int n,int m){
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i==n||j==n){
            //boundary cross
            return 0;
        }
        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n = 3 , m = 3;
        System.out.println(gridWays(0,0,n,m));
    }
}
