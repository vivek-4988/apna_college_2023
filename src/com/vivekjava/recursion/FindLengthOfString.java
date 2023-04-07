package com.vivekjava.recursion;

public class FindLengthOfString {

    public static int fn(String n) {
        if (n.length() == 0) {
            return 0;
        }

        return fn(n.substring(1)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(fn("abcde"));
    }

}
