package com.prateek.javaMarchB2.arrays;

import java.util.Arrays;

public class ShoppingCart {

    public static int[] searchAll(int[] arr,int element){
        int cnt=0;
        for(int x:arr){
            if(x==element){
                cnt++;
            }
        }
        // create a new array of size == cnt
        int[] output = new int[cnt];
        int j =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                output[j] = i;
                j++;
            }
        }
        return output;
    }
    public static int[] searchAll2(int []arr,int element){
        int n = arr.length;
        int[] output = new int[n+1];
        int j = 0; //output

        for(int i=0; i<n; i++){
            if(arr[i]==element){
                output[j] = i;
                j++;
            }
        }
        //terminating the output with -1
        output[j] = -1;
        return output;
    }


    public static void main(String[] args) {
        int arr[] = {5,6,7,2,7,3,7,4};
        int[] output = searchAll(arr,7);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(output));

        output = searchAll2(arr,7);
        for(int j=0; output[j]!=-1; j++){
            System.out.print(output[j]+",");
        }
    }
}
