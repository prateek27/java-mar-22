package com.prateek.javapractice.ArraysExtraClass;

public class BinarySearch {

    public static int binarySearch(int arr[],int element){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = (s+e)/2;
            // compare the mid
            if(arr[mid] > element){
                e = mid - 1;
            }
            else if(arr[mid]==element){
                return mid;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearchFirstOcc(int arr[],int element){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] > element){
                e = mid - 1;
            }
            else if(arr[mid]==element){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        // after the loop is over
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,11,15,20,23,26,30}; //Inc sorted array
        int element = 7;
        int res = binarySearch(arr,element); // LogN
        if(res==-1){
            System.out.println("Not present");
        }
        else{
            System.out.println("Present at idx " +res);
        }
    }
}
