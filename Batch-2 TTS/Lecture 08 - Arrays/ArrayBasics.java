package com.prateek.javaMarchB2.arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void playWithCart(){
        // Create , hardcoded list of integers
        int[] shopping_cart = {100,20,30,50,75};

        System.out.println(shopping_cart); //obj reference (array address)
        System.out.println(shopping_cart[3]);
        System.out.println(shopping_cart.length);

        // Print all the elements (iterate)
        for(int i=0; i < shopping_cart.length; i++){
            System.out.print(shopping_cart[i]+",");
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ,");
        }
    }
    // return the location of element in the array, -1 if not present
    public static int search(int[] arr,int element){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                return i;
            }
        }
        //never went to line 28
        return -1; //element is not present
    }


    public static void main(String[] args) {
        // User Input the Array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Allocate the array
        int[] arr = new int[n];

        printArray(arr);
        //user input
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Print-1
        printArray(arr);
        System.out.println();
        // 2 more ways to print
        // For-Each Loop
        int total_cost = 0;
        //Print-2
        for(int x : arr){
            System.out.println(x);
            total_cost = total_cost + x;
        }
        //Print-3
        System.out.println(Arrays.toString(arr)); // print array in one line

        System.out.println("Cart value " +total_cost);
        int element = 18;
        System.out.println(search(arr,element));

    }
}
