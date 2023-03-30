package com.vivekjava.strings;

public class StringPractise {

    public static void printLetters(String str){
        for (int i = 0; i < str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        String name = "vivek";
        String surName = "shah";

//        System.out.println(name.charAt(0));
            printLetters(name);

    }
}
