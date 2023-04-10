package com.vivekjava.recursion;

public class TowerOfHanoi {

    public static void tower(int n, char beg, char aux, char end) {
        if (n <= 0) {
            System.out.println("invalid n");
        }

        if (n == 1) {
            System.out.printf("moving %c to %c", beg, end);
            System.out.println();
            return;
        }

        tower(n - 1, beg, end, aux);
        System.out.printf("moving %c to %c", beg, end);
        System.out.println();
//        tower(1, beg, aux, end);
        tower(n - 1, aux, beg, end);
    }

    public static void main(String[] args) {

        tower(3, 'a', 'b', 'c');

    }

}
