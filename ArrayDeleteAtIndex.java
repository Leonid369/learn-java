package com.sara;

import java.util.Scanner;

public class ArrayDeleteAtIndex {
    public static void main(String[] args){
        int[] A = new int[10];
        A[0] = 3; A[1] = 9; A[2] = 7; A[3] = 8; A[4] = 12; A[5] = 6;
        int size = 6;

        Scanner sc = new Scanner(System.in);
        for(int x: A)
            System.out.print(x + " ");
        System.out.println();

        System.out.println("Enter index at which you want element to be deleted? ");
        int idx = sc.nextInt();

        for(int i = idx; i < size; i++){
            A[i] = A[i+1];
        }

        for(int x: A){
            System.out.print(x + " ");
        }
        System.out.println();


    }
}
