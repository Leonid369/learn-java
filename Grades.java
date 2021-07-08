package com.sara;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args)
    {
        int count = 0;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks scored in all 5 subjects");
        while(sc.hasNextInt())
        {
            total += sc.nextInt();
            count += 1;
            if(count==5)
                break;
        }
        int avg = total/count;
        System.out.println("Total: " + total);
        System.out.println("No of sub: " + count);
        System.out.println("Avg: " + avg);
        if(avg >= 70 )
            System.out.println("Grade: A");
        else if(avg<70 && avg>=60)
            System.out.println("Grade: B");
        else if(avg<60 && avg>=50)
            System.out.println("Grade: C");
        else if(avg<50 && avg>=40)
            System.out.println("Grade: D");
        else if (avg<40)
            System.out.println("Grade: E");
        else if (avg>100 || avg<0)
            System.out.println("Invalid Input");

    }
}
