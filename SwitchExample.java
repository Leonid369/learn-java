package com.sara;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number: ");
        int day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THUR");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("INVALID INPUT");
        }

    }
}
