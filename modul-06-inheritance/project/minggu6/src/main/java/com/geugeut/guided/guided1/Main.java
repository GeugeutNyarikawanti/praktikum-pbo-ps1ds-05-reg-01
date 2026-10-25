package com.geugeut.guided.guided1;

public class Main {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Superclass :");
        superclass.x = 3;
        superclass.y = 4;
        superclass.tampilXY();

        //member superclass bisa diakses dari subclassnya
        System.out.println("subclass :");
        subclass.x = 1;
        subclass.y = 2;
        subclass.tampilXY();
    }
}