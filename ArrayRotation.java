package com.sara;

public class ArrayRotation {
    public static void main(String[] args){
        int[] arr = {3,9,6,10,12,7,3,5,4,1};
        int[] A = arr.clone();
        System.out.println("Left Rotation: ");
        int first = A[0];
        for(int i = 1; i < A.length; i++){
            A[i-1] = A[i];
        }
        A[A.length-1] = first;
        for(int x: A){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();

        int[] B = arr.clone();
        System.out.println("Right Rotation: ");
        int last = B[B.length-1];
        for(int i = B.length-1; i >0; i--){
            B[i] = B[i-1];

        }
        B[0] = last;
        for(int x: B){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
    }
}
