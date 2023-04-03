package com.vivekjava.recursion;

public class TilingProblem {

    //2xn floor
    public static int tilingProblem(int n) {
        if (n <= 1) {
            return 1;
        }
        int verticaleLines = tilingProblem(n - 1);
        int horizontaLines = tilingProblem(n - 2);

        int totalWays = verticaleLines + horizontaLines;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }

}
