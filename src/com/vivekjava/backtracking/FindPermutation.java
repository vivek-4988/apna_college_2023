package com.vivekjava.backtracking;

public class FindPermutation {

    public static void findPermute(String str, String ans) {
        //base
        if (str.length()==0){
                System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
          String  strNew = str.substring(0, i) + str.substring(i + 1);
            findPermute(strNew,ans+cur);
        }


    }


    public static void main(String[] args) {
        String str = "abc";
        findPermute(str, "");
    }
}
