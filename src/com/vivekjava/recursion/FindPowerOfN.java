package com.vivekjava.recursion;

public class FindPowerOfN {

    public static int power(int n, int i) {
        if (i == 1){
            return n;
        }
        return n * power(n,i-1);
    }

    public static void main(String[] args) {
        System.out.println(power(3,3));
    }

}
