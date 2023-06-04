package com.vivekjava.stacks;


import java.util.Stack;

public class ValidParenthese {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        if (str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length() ; i++) {
            char curChar = str.charAt(i);
            if (curChar == '(' || curChar == '{' || curChar == '['){
                s.push(curChar);
            }else{
                if (s.isEmpty()){
                    return false;
                }else{
                    //closing
                    if (    (s.peek() == '(' && curChar == ')') ||
                            (s.peek() == '[' && curChar == ']') ||
                            (s.peek() == '{' && curChar == '}') ){
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }
        }

        if (s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({})[]";//true
        System.out.println(isValid(str));

    }
}
