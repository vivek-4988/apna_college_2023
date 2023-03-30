package com.vivekjava.twodarray;

public class PractiseQuestion {

    //Print the number of 7’s that are in the 2d array.
    public static void print7FromSecondArray() {
        int[][] arr = {
                {4, 7, 8},
                {8, 8, 7}
        };

        int countof7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    countof7++;
                }
            }
        }
        System.out.println(countof7);
    }

    public static void sumOfSecondRaw() {
        int[][] nums = {
                {1, 0, 9},
                {11, 9, 3},
                {2, 0, 3}};
        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[0].length; j++) {
//                if (i == 1) {
//                    sum += nums[i][j];
//                }
//            }
//        }

        for (int col = 0; col < nums[0].length; col++) {
            sum+=nums[1][col];
        }

        System.out.println(sum);
    }

    public static void transposeMatrix(){
        String[][] arr = {
                {"a11", "a12", "a13"},
                {"a21", "a22", "a23"},};
        String[][] transponse = new String[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                transponse[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < transponse.length; i++) {
            for (int j = 0; j < transponse[0].length ; j++) {
                System.out.print(transponse[i][j]+",");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        print7FromSecondArray();
        sumOfSecondRaw();
        transposeMatrix();
    }

}
