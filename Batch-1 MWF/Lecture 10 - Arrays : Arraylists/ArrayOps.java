package com.prateek.javaMarchB2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1 insertion later
        int[] arr = new int[n+1];

        // Read the array (n) elements
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Print
        System.out.println(        );
        // Insertion
        int pos = sc.nextInt();
        int Y = sc.nextInt();
        // Shifting
        for(int i=n-1; i>= pos-1; i--){
            arr[i+1] = arr[i];
        }
        // Print
        System.out.println(Arrays.toString(arr));

        // Overwrite the element at 'pos'
        arr[pos-1] = Y;

        // Print
        System.out.println(Arrays.toString(arr));


    }
}
