package com.sara;

import java.util.Scanner;

public class DiamondN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diamond length: ");
        int n = sc.nextInt();

        int mid = (n+1)/2;
        int i;
        for(i = 0; i < mid; i++){
            for(int j = 1; j <= n; j++){
                if(j>=(mid-i) && j<=(mid+i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for(int k = i-2; k >= 0; k--){
            for(int j = 1; j <= n; j++){
                if(j>=(mid-k) && j<=(mid+k))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
