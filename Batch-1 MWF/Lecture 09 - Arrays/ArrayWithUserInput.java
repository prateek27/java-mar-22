package com.prateek.javaMarchB2.arrays;

import java.util.Scanner;

public class ArrayWithUserInput {

    // create a separate function to print the array
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    // a function to search for a element in the array (Linear Search)
    public static int findElement(int[] arr,int element){
        // return the index where the element is present, other return -1 if not present
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                return i;
            }
        }
        // you will reach this line if you didnt reach line 19
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //create a array of size n
        int[] marks = new int[n]; // 0 0 0 0 0
        printArray(marks);
        // read all the n locations
        for(int i=0; i< marks.length; i++){
            marks[i] = sc.nextInt();
        }
        //print again
        printArray(marks);
        System.out.println(marks); //array address

        int ele = sc.nextInt();
        System.out.println(findElement(marks,ele));

    }
}
