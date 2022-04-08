package com.prateek.javaMarchB2.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //primitive
        int x = 5;

        Integer num = sc.nextInt();
        // object
        Integer y = 17; //more powerful as it contains behaviour/actions
        Integer z = 5;
        // arraylist only understand data in terms ob objects
        ArrayList<Integer> a = new ArrayList<>();
        a.add(y);
        a.add(x); // Autoboxing
        a.add(10);
        a.add(20);
        a.add(11);
        a.add(13);
        a.add(num);
        a.add(num);

        for(Integer i : a){
            System.out.print(i + ",");
        }
        // a.remove(5); // ? 1 index ? 1 object

        a.remove(z);
        while(a.contains(num)) {
            a.remove(num);
        }

        a.remove(Integer.valueOf(10));
        System.out.println();

        for(Integer i : a){
            System.out.print(i + ",");
        }
        // Wrapper
        // add
        // get
        // set
        // remove
    }
}
