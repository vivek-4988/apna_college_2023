package com.vivekjava.linkedlist;

public class LLPalinDrome {

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
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    //slow fast concept
    public Node findMid() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = head.next;//+1
            fast = fast.next.next;//+2
        }

        return slow;//slow is my mid
    }


    public boolean isPalindrome() {
        //find mid
        //reverse second hald
        //check left and right half

        //corner case
        if (head == null || head.next == null) {
            return true;
        }

        //1
        Node midNode = findMid();

        //2.reverse
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //check left and right
        while (right != null && left!=null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }


        return true;
    }


    public static Node head;
    public static Node tail;

    static int size;

    public static void main(String[] args) {
        LLPalinDrome ll = new LLPalinDrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
//        ll.addLast(3);

        ll.printLL();
        System.out.println(ll.isPalindrome());
    }
}
