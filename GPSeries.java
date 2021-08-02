package com.sara;

import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        System.out.println("Enter the length: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int curr = a * (int)(Math.pow(r,i));
            System.out.print(curr + " ");
        }

    }
}
