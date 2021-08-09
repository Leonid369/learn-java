package com.sara;

public class ArrayMax {
    public static void main(String[] args){
        int[] A = {3,9,7,8,12,6,15,5,4,10};

        int max = Integer.MIN_VALUE;
        for(int x: A ){
            if (max < x) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
