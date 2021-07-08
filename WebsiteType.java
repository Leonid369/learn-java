package com.sara;

import java.util.Scanner;

public class WebsiteType {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website url: ");
        String url = sc.nextLine();
        if(url.endsWith(".com"))
            System.out.println("Commercial");
        else if(url.endsWith(".org"))
            System.out.println("Organization");
        else if(url.endsWith(".net"))
            System.out.println("Network");

        if(url.startsWith("http"))
            System.out.println("Hyper Text Transfer Protocol");
        else if(url.startsWith("ftp"))
            System.out.println("File Transfer Protocol");
    }
}
