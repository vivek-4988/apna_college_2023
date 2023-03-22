package com.vivekjava.pattern;

public class PatternBasic {
    public static void main(String[] args) {
        int n = 5;
        funp9(n);
    }


    //1-0 triange
    static void funp9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    //flyod
    static void funp8(int n) {
        int counter = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" "+counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    //inverted hal rorate pyramid
    static void funp7(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    //inverted pyramid
    static void funp6(int n) {
        for (int i = 1; i <= n; i++) {
//            for (int j = i+1; j <=n ; j++) {
//                System.out.print("   ");
//            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //hollow
    static void funp5(int n) {
        int col = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == n || j == col) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void funP1(int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    static void funp2(int n) {
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void funP3(int n) {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void funP4(int n) {
        char ch = 'A';
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}