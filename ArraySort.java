package com.sara;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){
        String arr[] = {"java", "python", "c++"};
        Arrays.sort(arr);
        for(String x: arr)
            System.out.print(x + " ");
    }
}
