package com.sara;

import java.util.Scanner;

public class DateRegex {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        //Find if number is binary
        System.out.println("Enter number for binary check: ");
        String binaryNumber = sc.next();
        if(binaryNumber.matches("[01]+"))
            System.out.println("Yes, its a binary number!");
        else
            System.out.println("Not a binary number.");


        //Find out if hexadecimal number
        System.out.println("Enter number for hexadecimal check: ");
        String hexNumber = sc.next();
        if(hexNumber.matches("[A-F0-9]+"))
            System.out.println("Yes, its a hexadecimal number");
        else
            System.out.println("Not a hexadecimal number");


        //Find if date in format (dd/mm/yyyy)
        System.out.println("Enter date: ");
        String date = sc.next();
        if(date.matches("[0-3][0-9]/[0-1][1-9]/[0-9]{4}"))
            System.out.println("Date matches format (dd/mm/yyyy)");
        else
            System.out.println("Date doesn't match format.");
    }
}
