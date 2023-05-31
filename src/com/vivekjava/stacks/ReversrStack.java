package com.vivekjava.stacks;


import java.util.Stack;

public class ReversrStack {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);
        print(stack);

    }

    private static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    private static void print(Stack<Integer> s) {
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

}
