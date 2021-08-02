package com.sara;

import java.util.Scanner;

public class DisplayInWords {
    private static String toWord(int num){
        switch(num){
            case '1':
                return("one");
            case '2':
                return("two");
            case '3':
                return("three");
            case '4':
                return("four");
            case '5':
                return("five");
            case '6':
                return("six");
            case '7':
                return("seven");
            case '8':
                return("eight");
            case '9':
                return("nine");
            case '0':
                return("zero");
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        String rev = Integer.toString(n);

        String ans = "";
        for(char x: rev.toCharArray())
            ans += toWord(x) + " ";
        System.out.println(ans);
    }
}
