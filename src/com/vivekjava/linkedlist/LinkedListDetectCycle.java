package com.vivekjava.linkedlist;

public class LinkedListDetectCycle {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int data) {
        //1.create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //2.assign to next head
        newNode.next = head;//link

        //step3
        head = newNode;
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;


        while (fast.next!=null && slow.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow==fast){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());

    }
}
