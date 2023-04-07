package com.vivekjava.recursion;

public class PrintBinaryStrings {

    public static void printBinaryStr(int n, int lastPlace, String str) {
//        if(lastPlace==0){
//            printBinaryStr(n-1,0,str.append("0"));
//            printBinaryStr(n-1,1,str.append("1"));
//        }else{
//            printBinaryStr(n-1,0,str.append("0"));
//        }
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryStr(n - 1, 0, str+"0");
        if (lastPlace == 0) {
            printBinaryStr(n - 1, 1, str+"1");
        }

    }

    public static void main(String[] args) {
        int n = 3;
        printBinaryStr(n, 0,"");
    }

}
