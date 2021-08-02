package com.sara;

import java.util.Scanner;

public class Fibonacci {
    private static int fib(int n){
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
            System.out.print(fib(i) + " ");

    }
}
