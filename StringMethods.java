package com.sara;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethods {

    public static void main(String[] args)
    {
        String str = "Java program example";
        int l = str.length();
        System.out.println("Length of the string: " + l);
        // String objects are immutable, so always new ref and object are created with the operations performed
        System.out.println("String in lower case: " + str.toLowerCase());
        System.out.println("String in upper case: " + str.toUpperCase());
        String str2 = "   Welcome   ";
        System.out.println("String after leading and trailing whitespaces are removed: " + str2.trim());
        System.out.println("Sub string starting from 3rd index :" + str.substring(3));
        System.out.println("Sub string starting at 3rd and ending at 6th index: " + str.substring(3,6));
        System.out.println("Replaced 'a' with 'k' in string: " + str.replace('a','k'));
        System.out.println("Does the string start with 'Java': " + str.startsWith("Java"));
        System.out.println("Does the string end with 'sample': " + str.endsWith("example"));
        System.out.println("Character at index 8: " + str.charAt(8));
        System.out.println("Index of first occurrence of 'va': " + str.indexOf("va"));
        System.out.println("Index of occurrence of e after index 9: " + str.indexOf("a",9)); // left to right
        System.out.println("Index of last occurrence of 'a' 9 from last: " + str.lastIndexOf('a',9)); // right to left
        System.out.println("Does 'java' come before 'python'? " + "java".compareTo("python"));
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }



}
