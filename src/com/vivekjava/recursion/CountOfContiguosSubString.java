package com.vivekjava.recursion;

public class CountOfContiguosSubString {

    //Sample Input 1: S = "abcab"
    // SampleOutput 1: 7There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
    // Out of the above substrings , there are 7 substrings:a,abca,b,bcab,c,aandb.
    // So,only 7 contiguous substrings start and end with the same character.
    public static int countSubStrs(String str, int i, int j, int n) {
        if (n == 1) {
            return i;
        }
        if (n <= 0) {
            return 0;
        }


        int res = countSubStrs(str, i + 1, j, n - 1) +
                countSubStrs(str, i, j - 1, n - 1) -
                countSubStrs(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcab";
//        System.out.println(countSubStrs(s));

        //todo simple o(n^2) approach
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                char charAt = s.charAt(j);
                str.append(charAt);
                System.out.print(str + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);

        int n = s.length();
        System.out.println(countSubStrs(s, 0, n - 1, n));

    }
}