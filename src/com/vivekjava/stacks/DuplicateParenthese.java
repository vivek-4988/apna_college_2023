package com.vivekjava.stacks;


import java.util.Stack;

public class DuplicateParenthese {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //closing
            if (c == ')'){
                int count = 0 ;
                while (s.peek() != '('){
                    s.pop();
                    count++;
                }
                if (count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            }else{
                //opening , operator , operands
                s.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //valid string
        String str = "(a+b)";//false no duplicate
        String str1 = "((a+b))";//true duplicate
        String str2 = "((a+b)+(c))";//false no duplicate
        String str3 = "((a+b)+(c))";//false duplicate

        System.out.println(isDuplicate(str2));
    }
}
