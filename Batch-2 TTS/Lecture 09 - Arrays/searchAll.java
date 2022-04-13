package com.prateek.javaMarchB2.arraysb2;

import java.util.Arrays;

public class searchAll {

    public static int[] searchAll(int[] arr,int element){
        int count =0;
        for(int x:arr){
            if(x==element){
                count++;
            }
        }
        // create a output array of len count
        int[] output = new int[count];
        // fill this array
        int j = 0;
        // Linear Search for repeated values
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                output[j] = i;
                j++;
            }
        }
        return output;
    }

    public static int [] searchAll2(int[] arr,int element){
        int n = arr.length;
        int[] output = new int[n+1];

        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                output[j] = i;
                j++;
            }
        }
        output[j] = -1; //to denote the end of the output
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,50,30,60,30};
        int element = 30;

       // int[] output = searchAll(arr,element);
        // System.out.println(Arrays.toString(output));

        int[] output = searchAll2(arr,element);
        System.out.println(Arrays.toString(output));
        for(int i=0; output[i]!=-1; i++){
            System.out.print(output[i] + " ");
        }
    }
}
