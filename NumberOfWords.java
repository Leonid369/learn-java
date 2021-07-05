package com.sara;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Remove special characters from string
        System.out.println("Enter a sentence: ");
        String sent = sc.nextLine();
        sent = sent.replaceAll("[^a-zA-Z0-9 ]+","");
        System.out.println("Removed special characters: ");
        System.out.println(sent);


        //Remove extra spaces from string
        System.out.println("Enter a sentence: ");
        String sent2 = sc.nextLine();
        sent2 = sent2.replaceAll("\\s+"," ").trim();
        System.out.println("Removed extra spaces");
        System.out.println(sent2);

        //Find number of words in string
        System.out.println("Enter a sentence: ");
        String sent3 = sc.nextLine();
        String words[] = sent3.split("\\s");
        System.out.println("Number of words in sentence is: " + words.length);
    }
}
