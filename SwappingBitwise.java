package com.sara;

public class SwappingBitwise {
    public static void main(String[] args)
    {
        int a = 9;
        int b = 12;
        System.out.println("a and b before swapping: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println();
        System.out.println("a and b after swapping: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
