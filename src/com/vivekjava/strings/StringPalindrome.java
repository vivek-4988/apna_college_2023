package com.vivekjava.strings;

public class StringPalindrome {

    public static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            System.out.print(str.charAt(i) + " " + str.charAt(str.length() - 1 - i));
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
            System.out.println();
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "raceecar";
//        String str = "madcddam";
        System.out.println(checkPalindrome(str));
    }
}
