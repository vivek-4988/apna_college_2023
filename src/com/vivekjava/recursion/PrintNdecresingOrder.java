package com.vivekjava.recursion;

public class PrintNdecresingOrder {





    public static void fn(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        fn(n-1);

    }

    public static void funIncreaseOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        funIncreaseOrder(n-1);
        System.out.print(n+" ");
    }




    public static void main(String[] args) {
       fn(10);
       funIncreaseOrder(10);
    }

}
