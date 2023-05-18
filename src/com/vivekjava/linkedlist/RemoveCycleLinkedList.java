package com.vivekjava.linkedlist;

public class RemoveCycleLinkedList {

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


    public static void removeCycle(){
        //1.detect cycle
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                cycle = true;
                break;
            }
        }
        if (cycle==false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while (slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

        //remove cycle = last.next = null

    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();;
        System.out.println(isCycle());

    }
}
