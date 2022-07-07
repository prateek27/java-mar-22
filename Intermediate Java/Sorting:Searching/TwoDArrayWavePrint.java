package com.prateek.javapractice.ArraysExtraClass;

import java.util.Scanner;

public class TwoDArrayWavePrint {

    public static void wavePrint(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length; //cols are fixed across all rows

        //logic
        for(int col=0; col < cols; col++){
            if(col%2==0){
                //even col
                for(int r=0; r<rows; r++){
                    System.out.print(arr[r][col] + ",");
                }
            }
            else{
                // odd col
                for(int r=rows-1; r>=0; r--){
                    System.out.print(arr[r][col] + ",");
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        wavePrint(arr);
    }
}
