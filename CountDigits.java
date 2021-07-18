package com.sara;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args)
    {
        int count = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose digits count is to be calculated: ");
        int n = sc.nextInt();
        while(n > 0)
        {
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
