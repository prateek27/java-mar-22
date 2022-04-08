package com.prateek.javaMarchB2.arrays;

// Package where
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Creating
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(10);
        arrList.add(20);
        // insert in the middle
        arrList.add(0,5);
        // update
        arrList.set(1,12);

        // get
        System.out.println(arrList.get(0));
        System.out.println(arrList.get(1));
        System.out.println(arrList.get(2));

        // iterate
        for(Integer x : arrList){
            System.out.print(x + ",");
        }
        // another way
        System.out.println();

        for(int i=0; i<arrList.size(); i++){
            System.out.print(arrList.get(i) + ",");
        }


        // arrList.trimToSize(100);
    }
}
