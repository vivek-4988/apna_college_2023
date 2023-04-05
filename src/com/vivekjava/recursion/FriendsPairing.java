package com.vivekjava.recursion;

public class FriendsPairing {

    public static int fn(int n){

        if(n==1||n==2){
            return n;
        }

        //choice
        //single
        int fnm1 = fn(n-1);

        //pair
        int fnm2 = fn(n-2);
        int pairWays = (n-1) * fnm2;
        return fnm1 + pairWays;

    }

    public static void main(String[] args) {
        System.out.println(fn(3));
    }

}
