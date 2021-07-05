package com.sara;

import java.util.Scanner;

public class Email {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id: ");
        String email = sc.next();

        // Find if email id is provided by gmail
        if(email.matches("\\w*@gmail.com"))
            System.out.println("Yes, this is a gmail id.");
        else
            System.out.println("Not a gmail id.");

        // Find username and domain name from email
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

    }
}
