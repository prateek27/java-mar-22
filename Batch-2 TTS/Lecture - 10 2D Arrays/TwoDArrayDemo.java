package com.prateek.javaMarchB2.TwoDArraysExtra;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {
    public static void printArray(int[][] arr){
        for(int i=0; i< arr.length; i++){
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + ",");
            }
            // print a new line
            System.out.println();
        }
    }
    public static int[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //create a 2d array
        int[][] arr = new int[rows][cols];
        // default - 0 value
        // values as input
        for(int i=0; i<rows; i++){
            // every col of ith row
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int[][] createJaggedArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();


        //create a 2d array
        int[][] arr = new int[rows][];

        // input cols and data for each row
        for(int i=0; i< rows; i++){
            System.out.println("Cols in "+i + "row");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            // read the data for ith row
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void wavePrint(int[][] arr){
        int rows = arr.length;
        //fixed cols
        int cols = arr[0].length;

        for(int col=0; col< cols; col++){
            if(col%2==0){
                //even -> top to bottom
                for(int row=0; row<=rows-1; row++){
                    System.out.println(arr[row][col]);
                }
            }
            else{
                for(int row=rows-1; row>=0; row--){
                    System.out.println(arr[row][col]);
                }
            }
        }

    }

    public static void main(String[] args) {
        // Hard-Coded array
        // int[][] arr = {{1,2,3,10,11},{4,5,6,8},{7,8,9}};
        int[][] arr = create2DArray();
        // int [][] arr = createJaggedArray();
        System.out.println(Arrays.toString(arr));
        printArray(arr);
        wavePrint(arr);

        /*
        System.out.println(arr); //address of arr, 1d of object references
        System.out.println(arr[0]); //address of 0th row (1d array)
        System.out.println(arr[1]); //address of 1st row (1d array)
        System.out.println(arr[2]);

        // Loop or Arrays.toString(...)
        System.out.println(Arrays.toString(arr));
        // Print 0th Row
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        */

    }
}
