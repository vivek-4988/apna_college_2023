package com.vivekjava.oops;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    @Override
    void walk() {
        System.out.println("Horse walks and run");
    }
}

class Chicken extends Animal{

    @Override
    void eat() {
        //super.eat();
        System.out.println("chicken eating");
    }

    @Override
    void walk() {
        System.out.println("Chicken run on 2 legs");
    }
}
