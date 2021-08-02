package com.sara;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int curr = a + (i * d);
            System.out.println(curr + " ");
        }
    }
}
