package com.sara;

public class Regex {
    public static void main(String[] args)
    {
        String str = "smith@hotmail.com";
        // check if email id
        System.out.println(str.matches("\\w*@.\\w*.com"));
    }

}
