package com.hillel.lesson2.homework;

public class Main {
    public static void main(String[] args) {

        short a = 10525;
        short b = 11420;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        short c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}
