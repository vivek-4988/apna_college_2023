package com.vivekjava.bitmanipulation;

public class BitWiseOddEven {

    public static void oddEven(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        oddEven(1);
    }
}
