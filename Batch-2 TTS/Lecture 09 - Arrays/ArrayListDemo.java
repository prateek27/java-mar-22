package com.prateek.javaMarchB2.arraysb2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<int> arr1 = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>(17);
        Scanner sc = new Scanner(System.in);

        // Operations
        // add, remove, get ...
        arr.add(8);
        arr.add(5);
        arr.add(7);
        arr.add(11);
        int no = sc.nextInt();
        arr.add(no);

        //insert in the middle
        arr.add(1,6);
        System.out.println(arr.size());

        Integer z = 0;
        arr.set(0,z);
        arr.set(1,2); //update

        // remove at indx 2
        arr.remove(2);

        // remove object 2
        arr.remove(Integer.valueOf(2));


        // another way to print
        for(int i=0; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }

        // for each loop
        for(int x:arr){
            System.out.println(x + " ");
        }

        // some additional code has been written for this behaviour
        arr.clear();
        System.out.println(arr);
    }

}
