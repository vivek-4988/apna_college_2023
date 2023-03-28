package com.vivekjava.oops;

public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.moves();

    }
}


class MyParent {
    public void moves() {
        System.out.println("parent move by super");
    }
}

class Child extends MyParent{
    @Override
    public void moves() {
        super.moves();
        System.out.println("child called");
    }
}
