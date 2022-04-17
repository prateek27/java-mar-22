package com.prateek.javaMarchB2.OOPS;

import java.util.ArrayList;
import java.util.Arrays;

public class Doubt {

    public static ArrayList<Integer> getArrayList(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = getArrayList();
        System.out.println(arr);

        String s = "hello";
        s = s + "world";
    }
}
