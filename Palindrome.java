package com.sara;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if palindrome: ");
        int n = sc.nextInt();
        int rev = 0;
        int r = 0;
        int m = n;
        while(n > 0){
            r = n % 10;
            rev = rev * 10 + r;
            n = n/10;
        }

        if (rev == m)
            System.out.println("Palindrome!");
        else
            System.out.println("Not a palindrome.");
    }
}
