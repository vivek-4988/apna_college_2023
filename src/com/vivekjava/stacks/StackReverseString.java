package com.vivekjava.stacks;


import java.util.Stack;

public class StackReverseString {

    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder stringBuilder = new StringBuilder("");
        while (!s.isEmpty()){
            char cur = s.pop();
            stringBuilder.append(cur);
        }

        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        String str = "abc";
        reverseString(str);

//        while (!stack.isEmpty()){
//            System.out.print(stack.peek()+" ");
//            stack.pop();
//        }

    }

}
