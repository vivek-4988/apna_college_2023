package com.vivekjava.stacks;


import java.util.Stack;

public class StackCollectionFW {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(8);
        stack.push(9);

        while (!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }

    }

}
