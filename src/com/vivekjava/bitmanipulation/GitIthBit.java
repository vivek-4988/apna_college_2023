package com.vivekjava.bitmanipulation;

public class GitIthBit {

    public static void getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args)
    {
        getIthBit(10,2);
        System.out.println(setIthBit(5,2));
    }
}
