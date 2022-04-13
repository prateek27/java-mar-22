package com.prateek.javaMarchB2.arraysb2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //create a bigger array
        int arr[] = new int[n+1];

        //read the n elements
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // print
        System.out.println(Arrays.toString(arr));

        // take input the pos & element
        int pos = sc.nextInt();
        int Y = sc.nextInt();

        // shifting from right
        for(int i=n-1; i >= pos-1; i--){
            arr[i+1] = arr[i];
        }

        //print
        System.out.println(Arrays.toString(arr));

        // now insert the reqd index
        arr[pos-1] = Y;

        //print
        System.out.println(Arrays.toString(arr));


    }
}
