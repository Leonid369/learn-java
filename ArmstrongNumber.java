package com.sara;

import java.util.Scanner;

public class ArmstrongNumber {
    // if sum of cubes of digits of a number equals the number itself - then its called Armstrong number
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int ans = 0;
        int n = num;
        while(n > 0)
        {
            int r = n%10;
            ans += (r*r*r);
            n = n/10;
        }
        if(ans == num)
            System.out.println("Its an Armstrong!!!");
        else
            System.out.println("Not an Armstrong.");
    }
}
