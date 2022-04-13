package com.prateek.javaMarchB2.TwoDArraysExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class UniqueNo {

    public static int solve(ArrayList<Integer> A){
        int res = 0;
        for(int x : A){
            res = res ^ x;
        }
        return res;
    }


    public static void main(String[] args) {

        // System.out.println(5^5);
        // System.out.println(5^7^5);
        // System.out.println(5^7);
        // System.out.println(2^5^7^8^5^8^2);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,4,2,1,1,2,3));

        int output = solve(arr);
        System.out.println(output);


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 0;
        for(int i=1; i<=n; i++){
            int no = sc.nextInt();
            res = res^no;
        }
        System.out.println(res);

    }
}
