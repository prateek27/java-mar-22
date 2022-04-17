package com.prateek.javaMarchB2.OOPS;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArrayListDemo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        ArrayList<Integer> row0 = new ArrayList<>(Arrays.asList(1,2,3,5,6));
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(7,8,6));

        a.add(row0);
        a.get(0).add(12);
        a.add(row1);

        System.out.println(a.get(1).get(1));

        //print the arraylist
        for(int i=0; i<a.size();i++){
            // System.out.println(a.get(i));
            //iterate over every element of ith row
            for(int x:a.get(i)){
                System.out.print(x + ",");
            }
            System.out.println();
        }

        for(int i=0; i<a.size();i++){
            // System.out.println(a.get(i));
            //iterate over every element of ith row
            for(int j=0; j<a.get(i).size(); j++){
                System.out.print(a.get(i).get(j) + " .");
            }
            System.out.println();
        }
    }
}
