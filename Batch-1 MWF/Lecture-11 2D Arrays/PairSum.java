package com.prateek.javaMarchB2;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int arr[] = {2,8,5,10,13,11,15,7};

        // 99% of the times you can use it interviews
        // Sort (of-course you can use)
        Arrays.sort(arr);

        // pair sum
        int i=0;
        int j = arr.length - 1;
        int sum = 15;

        while(i<j){
            if(arr[i]+arr[j]>sum){
                j--;
            }
            else if(arr[i]+arr[j]==sum){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }
            else{
                //arr[i] + arr[j] < sum
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
