package com.vivekjava.linkedlist;

public class ReverseLinkedList {

    public class Node {

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
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //2.assign to next head
        newNode.next = head;//link

        //step3
        head = newNode;
    }


    public void addLast(int data) {
        //1.create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //2.assign to next head
        tail.next = newNode;//link

        //step3
        tail = newNode;
    }

    public void printLL() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static Node head;
    public static Node tail;

    static int size;


    //3 variables 4 steps
    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }




    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
        ll.reverseLL();
        ll.printLL();

        System.out.println("SIZE "+size);
    }
}
