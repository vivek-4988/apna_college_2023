package com.vivekjava.strings;

public class StringCompression {


    public static void main(String[] args) {
        String str = "aaabbbccccd";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }
        }

        System.out.println(newStr);
    }
}
