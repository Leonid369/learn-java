package com.sara;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args){
        int A[] = { 8,6,10,9,2,15,7,13,14,11};
        int B[] = new int[A.length];
        int C[] = new int[A.length];

        for(int i = 0; i < A.length; i++){
            B[i] = A[i];
        }

        //Reverse Copy
        int j = 0;
        for(int i = A.length-1; i>=0; i--){
            C[j++] = A[i];
        }
        for(int i = 0; i < C.length; i++)
            System.out.print(C[i] + " ");
        System.out.println();


    }
}
