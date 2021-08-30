package com.sara;

public class ArraySizeIncrease {
    public static void main(String[] args){
        int[] A = {8,6,10,9,2};
        System.out.println(A.length);
        int[] B = new int[10];
        for(int i = 0; i < A.length; i++){
            B[i] = A[i];
        }
        A = B;
        B = null;
        System.out.println(A.length);

    }
}
