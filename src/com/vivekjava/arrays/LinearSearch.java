package com.vivekjava.arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] marks = {2,4,6,8,30,60,100,200};
        int key=60;
        System.out.println(linearSearch(marks,key));

    }

    public static int linearSearch(int[] num, int key){
        for (int i = 0; i < num.length; i++) {
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }

}
