package com.vivekjava.stacks;


import java.util.Stack;

public class StackPushAtBottom {

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
        stack.push(7);
        stack.push(8);
        stack.push(9);

        pushAtBottom(stack,11);
        while (!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }

    }

}
