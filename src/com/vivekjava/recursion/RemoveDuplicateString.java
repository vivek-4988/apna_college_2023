package com.vivekjava.recursion;

public class RemoveDuplicateString {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kaam
        char curChar = str.charAt(idx);
        if (map[curChar - 'a']) {
            removeDuplicates(str,idx+1,newStr,map);
        }else{
            map[curChar-'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(curChar),map);
        }
    }

    public static void main(String[] args) {
        String str = "appnaacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }

}
