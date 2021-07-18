package com.sara;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be calculated: ");
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 1; i <= n; i++)
        {
            ans *= i;
        }
        System.out.println(ans);
    }
}
