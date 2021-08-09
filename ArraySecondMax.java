package com.sara;

public class ArraySecondMax {
    public static void main(String[] args){
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int max = A[0];
        int secondMax = A[0];
        for(int x: A){
            if(max<x){
                secondMax = max;
                max = x;
            }
            else if(x>secondMax)
                secondMax = x;
        }
        System.out.println(secondMax);
    }
}
