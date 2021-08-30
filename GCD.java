package com.sara;

public class GCD {
    static int gcd(int x, int y){
        while(x != y){
            if(x > y)
                x -= y;
            if(y > x)
                y -= x;

        }
        return x;
    }

    public static void main(String[] args){
        System.out.println(gcd(35,56));
    }
}
