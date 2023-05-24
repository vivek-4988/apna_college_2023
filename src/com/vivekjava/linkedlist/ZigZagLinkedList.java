package com.vivekjava.linkedlist;

public class ZigZagLinkedList {

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

    public int removeFirst(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val =   head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;

        return val;
    }

    public int removeLast(){
        if (size == 0 ){
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0 ;

            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2 ; i++) {
                prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;

        return val;
    }


    public int search(int key){
        Node temp = head;
        int i =0 ;
        while (temp!=null){
            if (temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head,int key){
        if (head==null){
            return -1;
        }

        if (head.data == key){
            return 0;
        }

        int idx = helper(head.next,key);
        if (idx==-1){
            return -1;
        }

        return idx+1;
    }

    public int recursionSearch(int key){
        return helper(head,key);
    }


    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static Node head;
    public static Node tail;

    static int size;

    public void ZigZag(){
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        Node cur = mid.next;
        mid.next = null;//separate half

        Node prev = null;
        Node next ;

        while (cur!=null){
            //reverse ll
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        Node left = head;
        Node right = prev;

        //3 step merge
        Node nextL , nextR;
        while (left !=null && right!=null){
             nextL = left.next;
             left.next = right;
             nextR = right.next;
             right.next = nextL;

             left= nextL;
             right = nextR;

        }




    }


    public static void main(String[] args) {
        ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
        ll.ZigZag();
        ll.printLL();
    }
}
