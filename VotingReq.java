package com.sara;

import java.util.Scanner;

public class VotingReq {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.println("Congrats, you can vote now!");
        else
            System.out.println("Sorry you still have " + (18-age) + " more years to be eligible to vote.");
    }
}
