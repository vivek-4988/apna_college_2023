package com.vivekjava.recursion;

public class FindPowerOfNOptimized {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int multiPower = power(a, n / 2);
        int halfPower = multiPower * multiPower;
        if (n % 2 != 0) {
            halfPower = a * halfPower;
        }
        return halfPower;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }

}
