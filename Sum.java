package com.sara;

import java.util.Scanner;

public class Sum {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++)
        {
            ans += i;
        }
        System.out.println(ans);
    }
}
