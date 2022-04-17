package com.prateek.javaMarchB2.OOPS2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayListInput {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arr2D = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        //Input
        for(int i=0; i <rows; i++){
            ArrayList<String> stringList = new ArrayList<>();
            System.out.println("Enter columns");
            int cols = sc.nextInt();
            for(int j=0; j<cols; j++){
                String s = sc.next();
                stringList.add(s);
            }
            //next row
            arr2D.add(stringList);
        }

        // Output
        for(int i=0; i < arr2D.size() ; i++){
            for(int j=0; j < arr2D.get(i).size() ; j++){
                System.out.print(arr2D.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }
}
