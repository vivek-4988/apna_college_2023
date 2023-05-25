package com.vivekjava.linkedlist;

public class ReverseDoublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        size++;
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    public int removeFirst(){
        if (head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1){
            head= tail = null;
            size--;
            return val;
        }

        head = head.next;
        head.prev = null;

        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse(){
        Node cur = head;
        Node prev = null;
        Node next;

        while (cur!=null){
            next = cur.next;
            cur.next = prev;
            cur.prev = next;

            prev = cur;
            cur = next;
        }

        head = prev;


    }

    public static void main(String[] args) {
        ReverseDoublyLinkedList dbl = new ReverseDoublyLinkedList();
        dbl.addFirst(3);
        dbl.addFirst(2);
        dbl.addFirst(1);
        dbl.print();
//        dbl.removeFirst();
//        dbl.print();

        dbl.reverse();
        dbl.print();

    }
}
