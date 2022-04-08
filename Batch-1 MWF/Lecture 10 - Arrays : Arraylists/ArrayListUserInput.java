package com.prateek.javaMarchB2.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        //read
        for(int i=1; i<=N; i++){
            Integer num = sc.nextInt();
            arr.add(num);
        }
        // print
        for(Integer x:arr){
            System.out.println(x);
        }
    }
}
