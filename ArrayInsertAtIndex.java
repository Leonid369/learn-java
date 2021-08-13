package com.sara;

import java.util.Scanner;

public class ArrayInsertAtIndex {
    public static void main(String[] args){

        int[] A = new int[10];
        A[0] = 3; A[1] = 9; A[2] = 7; A[3] = 8; A[4] = 12; A[5] = 6;
        for(int x: A)
            System.out.print(x + " ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and index to insert at: ");
        int num = sc.nextInt();
        int idx = sc.nextInt();
        int size = 6;

        for(int i = size; i > idx; i--){
            A[i] = A[i-1];
        }
        A[idx] = num;

        for(int x: A)
            System.out.print(x + " ");
        System.out.println();

    }
}
