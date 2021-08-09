package com.sara;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter all elements");
        int i = 0;
        int [] A = new int[n];
        while(i < n){
            A[i++] = sc.nextInt();
        }

        int sum = 0;
        for(int x: A)
            sum += x;

        System.out.println("Sum is: " + sum);

    }
}
