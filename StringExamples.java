package com.sara;

public class StringExamples {
    public static void main(String[] args)
    {
        String str1 = "Java Program"; // created in pool
        String str2 = new String("JAVA"); // created in heap and pool
        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c, 1, 3);
        //System.out.println(str3);
        String s1 = "Java";
        String s2 = "Java";
        // The two references s1 and s2 are pointing to the same object in the pool
        System.out.println(s1==s2);

    }
}
