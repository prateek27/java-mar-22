package com.prateek.javaMarchB2.OOPS2;


import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr1D = new ArrayList<>(Arrays.asList(1,2,3));
        arr1D.add(5);
        arr1D.add(6);
        arr1D.add(7);
        System.out.println(arr1D); // print

        // 2D ArrayList
        ArrayList<ArrayList<Integer> > arr2D = new ArrayList<>();
        // create rows
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(7,8,9));
        ArrayList<Integer> z = new ArrayList<>(Arrays.asList(71,81,91));

        arr2D.add(x);
        arr2D.add(y);
        arr2D.add(z);
        arr2D.get(0).add(3,5);
        arr2D.get(0).add(100);
        arr2D.add(1,z);

        for(int i=0; i < arr2D.size() ; i++){
            // print i th row
            // System.out.println(arr2D.get(i));
            for(int j=0; j < arr2D.get(i).size() ; j++){
                System.out.print(arr2D.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }
}
