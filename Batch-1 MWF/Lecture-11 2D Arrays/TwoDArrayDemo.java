package com.prateek.javaMarchB2.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {
    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length;i++){
            // Go through ith row
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            // new line after every row
            System.out.println();
        }
    }
    public static void waveOrderPrint(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        for(int col=0; col<cols; col++){
            if(col%2==0){
                for(int row=0; row<rows;row++){
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

    public static int[][] createArrayUserInput(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        //creating
        int[][] arr = new int[rows][cols];
        // user input row by row
        for(int i=0; i< rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
    public static int[][] create2DwithVariableCols(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for(int i=0; i<rows; i++){
            System.out.println("Tell Cols in "+i+ " row");
            int cols = sc.nextInt();
            arr[i] = new int[cols]; //creating memory for for ith row
            //take input data in the ith row
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }



    public static void jagged2DArray(){
        // hard coded array
        int[][] arr = {{1,2,3}, {4,5,7,6},{7,8,9,10,11}};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(arr.length);
        // Loop to iterate over 2D Array
        arr[1][1] = 15; //update a particular element
        printArray(arr);
    }

    public static void main(String[] args) {
        //create
        int[][] arr = createArrayUserInput();//create2DwithVariableCols(); //
        printArray(arr);
        waveOrderPrint(arr);

    }
}
