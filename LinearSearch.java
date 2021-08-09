package com.sara;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to find: ");
        int key = sc.nextInt();
        for(int i=0; i<A.length; i++) {
            if (A[i] == key) {
                System.out.println("Found at " + i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
