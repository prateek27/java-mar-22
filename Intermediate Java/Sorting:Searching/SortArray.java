package com.prateek.javapractice.ArraysExtraClass;

import java.util.Arrays;

public class SortArray {

    public static void reverse(int[] arr){
        int i=0;
        int j = arr.length - 1;
        while(i<j){
            // swap a[i] & a[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,10,9,8,6,4,3,2};
        Arrays.sort(arr);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        System.out.println(arr[0]);
    }
}
