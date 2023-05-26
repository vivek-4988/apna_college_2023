package com.vivekjava.stacks;



public class StackWithLL {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(6);

        while (!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }

    }

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
            static Node head = null;
            public static boolean isEmpty(){
                return head == null;
            }

            //push
            public static void push(int data){
                Node node = new Node(data);
                if (isEmpty()){
                    head = node;
                    return;
                }
                node.next=head;
                head  = node;
            }

            //pop
            public static int pop(){
                if (isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            //peek
            public static int peek(){
                if (isEmpty()){
                    return -1;
                }
                return head.data;
            }
    }
}
