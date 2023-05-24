package com.vivekjava.linkedlist;

public class MergeSortinLL {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
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

    public Node head;
    public Node tail;

    static int size;

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid();
        Node rightHead = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    private Node getMid() {
        if(head == null){
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast.next != null && fast.next.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node sortedMerge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1.next;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

      /*  *//* Pick either a or b, and recur *//*
        if (head1.data <= head2.data) {
            result = head1;
            result.next = sortedMerge(head1.next, head2);
        }
        else {
            result = head2;
            result.next = sortedMerge(head1, head2.next);
        }*/

        return mergeLL;
    }

    public static void main(String[] args) {
        MergeSortinLL ll = new MergeSortinLL();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(2);
        ll.addFirst(8);

        ll.printLL();

        ll.head = ll.mergeSort(ll.head);
        ll.printLL();


    }
}
