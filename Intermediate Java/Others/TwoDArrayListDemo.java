package com.prateek.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayListDemo {

    // Create a function to read a 2D arraylist
    public static ArrayList<ArrayList<Integer> > readArrayList(){
        // N Rows
        // M Cols
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer> >  arr2D = new ArrayList<>(N);
        for(int i=0; i<N; i++){
            arr2D.add(new ArrayList<>(M));
            for(int j=0; j<M; j++){
                int no = sc.nextInt();
                arr2D.get(i).add(no);
                arr2D.get(i).add(no*no);
            }
        }
        return arr2D;
    }

    public static void main(String[] args) {
       // ArrayList<ArrayList<Integer> >  arr2D =  new ArrayList<>(5);

        /* let me create 1d arraylist and add it to the arr2D arraylist
        ArrayList<Integer> row0 = new ArrayList<>();
        row0.add(1);
        row0.add(2);
        row0.add(3);

        // Create Another Row
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(20,30,40,50));


        arr2D.add(row0);
        arr2D.add(row1);
        arr2D.add(row0);//same object reference

        arr2D.get(2).set(0,55);
        System.out.println(arr2D); */

        // Iterate over the 2d arraylist

        ArrayList<ArrayList<Integer> > arr2D = readArrayList();

        for(int r = 0; r < arr2D.size(); r++){
            for(int c = 0; c < arr2D.get(r).size(); c++){
                System.out.print(arr2D.get(r).get(c) + ",");
            }
            System.out.println();
        }
    }

}
