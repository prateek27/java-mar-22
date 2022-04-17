package com.prateek.javaMarchB2.OOPS;

import java.util.ArrayList;
import java.util.Arrays;

public class BitWiseXORDemo {

    public static int solve(ArrayList<Integer> a){
        int res = 0;
        // Best solution for this problem (speed)
        for(int x : a){
            res = res^x;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,8,1,5,7,1,2,7,5));
        System.out.println(solve(arr));
    }
}
